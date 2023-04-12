import React from 'react';
import Song from './Song.js';

const SongList = ({songs}) => {

    if (!Array.isArray(songs)) {
        return (
            <>
                <p>I display when the array is not there</p>
                <div>No songs to display</div>
            </>
        )
    }

    const songItems = songs.map((song) => {
        return <Song song={song}/>
    })

    return (
        <div>
            <p>Im a p tag in the SongList when there is a list</p>

            <ul>
                {songItems}
            </ul>
        </div>
    )
}

export default SongList;