import React, { useState, useEffect } from 'react';
import StoriesSelect from '../components/StoriesSelect';
import StoryDetail from '../components/StoryDetail';

function MainContainer() {
    const [stories, setStories] = useState([]);
    const [selectedStory, setSelectedStory] = useState('')

    useEffect(() => {
        // makes a get request to get top story id's (returns response object)
        fetch('https://hacker-news.firebaseio.com/v0/topstories.json')

            // converts response object to json object, containing an array of story ids
            .then(response => response.json())

            // chains a .then() to previous, passes storyIds array as an argument
            // .then means the function will run only after the previous one is complete
            .then(storyIds => {

            // creates an array of promises (storyPromises) using fetch method to retrieve data of each story by id
            const storyPromises = storyIds
                .map(id => fetch(`https://hacker-news.firebaseio.com/v0/item/${id}.json`))

            // returns a new promise which 'resolves' into an array of story details once all individual promises complete
            return Promise.all(storyPromises);
            })

            // chains another .then() method passing in array of story details as arg
            .then(storyResponses => {

            // converts each story detail response into a json object
            // and returns a new promise which resolves into an array of story objects (with each object containing story title, url, author etc.)
            return Promise.all(storyResponses.map(response => response.json()))

            })

            // new then chain passing in stories (array of story objects) and sorting them by score
            .then(stories => {
                stories.sort((a, b) => b.score - a.score); 
 
                // sets state with stories and rerenders
                setStories(stories);
            })
    }, []);

    return (
        <>
            {selectedStory ? (
                <div>
                    <h1>HackerNews</h1>
                    <StoriesSelect stories={stories} setSelectedStory={setSelectedStory} />
                    <StoryDetail selectedStory={selectedStory}/>
                </div>
            ) : (
                <StoriesSelect stories={stories} setSelectedStory={setSelectedStory} />
            )}
        </>
    );
}

export default MainContainer;
