import React, {useState} from 'react';
const StoriesSelect = ({stories, setSelectedStory}) => {

  const [filter, setFilter] = useState('');

  const handleSelect = (event) => {
      const selectedStoryId = event.target.value;
      const selectedStory = stories.find(story => story.id.toString() === selectedStoryId);
      setSelectedStory(selectedStory);
      console.log("selected:", selectedStory)
  };

  const filteredStories = stories.filter((story) =>
    story.title.toLowerCase().includes(filter.toLowerCase())
  );

  return (
    <div className='stories-list'>

      <input type='text' value={filter} onChange={(event) => setFilter(event.target.value)} placeholder='Filter by title'/>
      
      <select onChange={handleSelect}>
        <option value=''>Select a Story</option>
        {filteredStories.map((story) => (<option key={story.id} value={story.id}>{story.title} by {story.by}</option>
        ))}
      </select>

    </div> 
  );
}

export default StoriesSelect