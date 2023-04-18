
const StoryDetail = ({selectedStory}) => {
    return (
        <div>
            <a href={selectedStory.url}>{selectedStory.title}</a>
            <p>by {selectedStory.by}</p>
            
        </div>
    )
}

export default StoryDetail