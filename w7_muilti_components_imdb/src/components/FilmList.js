import React, { useState } from 'react';
import Film from "./Film";

const FilmList = ({films}) => {

    const filmNodes = films.map(film => {
        return (
            <Film name={film.name} key={film.id} url={film.url}></Film>
        );
    });

    return(
        <>
            {filmNodes}
        </>
    )
}

export default FilmList;