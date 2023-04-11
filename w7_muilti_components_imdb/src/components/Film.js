import React from "react";

const Film = ({name, url}) => {

    return(
        <>
        <li>
        <a href={url}>{name}</a>
        </li> 
        </>
    )
}

export default Film;