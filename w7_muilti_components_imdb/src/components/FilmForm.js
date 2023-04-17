import React, {useState} from "react";


// onFilmSubmit is the function passed in as a prop that will be called when the form is submitted
const FilmForm = ({onFilmSubmit}) => {

    // two useState hooks which create variables hooks allow each component to manage its own state
    const [name, setName] = useState("");
    const [url, setUrl] = useState("");

    // three event handlers that updates the var when the input elements change
    const handleNameChange = (e) => {
        // updates the state with new value
        setName(e.target.value);
    }

    const handleUrlChange = (e) => {
        setUrl(e.target.value)
    }

    const handleFilmSubmit = (e) => {
        e.preventDefault();
        const nameToSubmit = name.trim();
        const urlToSubmit = url.trim();
        if (!nameToSubmit || !urlToSubmit){
            return
        }

        onFilmSubmit({
            name: nameToSubmit,
            url: urlToSubmit
        });

        setName("");
        setUrl("");
    }

    return (
        <form onSubmit={handleFilmSubmit}>
            <input 
                type="text" 
                placeholder="Film name"
                value={name}
                onChange={handleNameChange}
            />
            <input 
                type="text" 
                placeholder="url"
                value={url}
                onChange={handleUrlChange}
            />
            <input 
                type="submit" 
                value="Post"
            />
        </form>
    )
}

export default FilmForm;