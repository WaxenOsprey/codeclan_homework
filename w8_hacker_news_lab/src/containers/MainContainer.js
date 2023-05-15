import React, { useState, useEffect } from 'react';
import StoriesSelect from '../components/StoriesSelect';
import StoryDetail from '../components/StoryDetail';

function MainContainer() {
    const [stories, setStories] = useState([]);
    const [selectedStory, setSelectedStory] = useState('')

    useEffect(() => {
        fetch('https://hacker-news.firebaseio.com/v0/topstories.json')
            .then(response => response.json())
            .then(storyIds => {
            const storyPromises = storyIds
                .map(id => fetch(`https://hacker-news.firebaseio.com/v0/item/${id}.json`))
            return Promise.all(storyPromises);
            })
            .then(storyResponses => {
            return Promise.all(storyResponses.map(response => response.json()))
            })
            .then(stories => {
                stories.sort((a, b) => b.score - a.score); 
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
