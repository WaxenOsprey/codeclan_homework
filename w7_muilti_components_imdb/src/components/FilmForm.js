import React, {useState} from "react";

const FilmForm = ({onFilmSubmit}) => {

    const [name, setName] = useState("");
    const [url, setUrl] = useState("");

    const handleNameChange = (e) => {
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