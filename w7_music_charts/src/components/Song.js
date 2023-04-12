import React from 'react';

const Song = ({song}) => {
    return (
        <>
            <li>ID: {song.id}</li>
            <li>{song.title}</li>
            <br />
        </>
    )
}

export default Song;