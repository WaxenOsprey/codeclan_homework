import React, { useState, useEffect } from 'react';
import SongList from '../components/SongList';


const SongBox = () => {

    const [songs, setSongs] = useState([]);

    // which state will be updated?
    useEffect(() => {
        console.log("useEffect triggered")
        getSongs();
    }, [])

    const getSongs = function(){
        fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
        .then(res => res.json())
        .then(songsdata => {
            const songObjects = songsdata.feed.entry.map(song => {
                return {
                    id: song.id.attributes['im:id'],
                    title: song.title.label,
                };
            });
            setSongs(songObjects)
        })

    }

    return (
        <div className='main-container'>
        <p>im a p tag in the SongBox</p>
            <SongList songs={songs}/>
        </div>
    )

}

export default SongBox;

