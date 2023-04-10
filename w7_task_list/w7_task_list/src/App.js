import './App.css';
import React, { useState } from 'react';


function App() {
  const [tasks, setTask] = useState([
    { name: "Hoover", priority: "Low" },
    { name: "Practice coding", priority: "High"},
    { name: "Cook dinner", priority: "Low"},
  ]);

  const [newTask, setNewTask] = useState("");

  const [selectedValue, setSelectedValue] = useState("");

  const handleRadioChange = (event) => {
    setSelectedValue(event.target.value);
  }

  const taskNodes = tasks.map((task, index) => {
    const priorityStyle = {
      borderColor: task.priority === "High" ? "red" : "green",
      color: task.priority === "High" ? "red" : "green",

      borderWidth: "5px",
      borderStyle: "solid"

    }
    
    
    return(
      <li key={index} style={priorityStyle}>
      <span> {task.name}: </span>
      <span> {task.priority} priority</span></li>
    )
  })

  const handleTaskInput = (event) => {
    setNewTask(event.target.value)  
  }

  const saveNewTask = (event) => {
    event.preventDefault();
    const copyTasks = [...tasks]
    copyTasks.push({name: newTask, priority: selectedValue})
    setTask(copyTasks)
    setNewTask("")
  }

  return (
    <>
    <div className='App'>
      <h1>ToDo's</h1>
      <form onSubmit={saveNewTask}>
        <label htmlFor="new-task">Add a new task:</label>
        <input id="new-task" type="text" value={newTask} onChange={handleTaskInput}/> 
       
        <label htmlFor="high-priority">High</label>
        <input type="radio" name="priority" id="high-priority" value="High" checked={selectedValue === "High"} onChange={handleRadioChange}/>
        
        <label htmlFor="low-priority">Low</label> 
        <input type="radio" name="priority" id="low-priority" value="Low" checked={selectedValue === "Low"} onChange={handleRadioChange}/>
        
        <input type="submit" value="Save Item"/>    
      </form>

      <ul>
        {taskNodes}
      </ul>

    </div>
  </>
  );
}

export default App;
