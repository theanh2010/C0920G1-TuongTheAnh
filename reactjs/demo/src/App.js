import Header from './component/Header'
import Tasks from './component/Tasks'
import AddTask from './component/AddTask'
import { useState,useEffect } from 'react'



function App() {
  const [showAddTask, setShowAddTask] = useState(false)
  const [tasks, setTasks] = useState([])

  useEffect(() => {
    const getTasks = async () => {
      const tasksFromServer = await fetchTasks()
      setTasks(tasksFromServer)
    }
      getTasks()
  }, [])

//  FETCH task
  const fetchTasks = async () => {
    const res = await fetch(`http://localhost:3000/tasks`)
    const data = await res.json()
    return data
  }

const deleteTask = async (id) => {
  await fetch(`http://localhost:5000/tasks/${id}` , {
    method: 'DELETE',
  })
  
  setTasks(tasks.filter( (task) => task.id !== id))
}

// ... clone một object qua 1 object khác
const toggleReminder = (id) => {
  setTasks(
    tasks.map((task) =>
      task.id === id ? {...task,reminder : 
        !task.reminder } : task
      )
  )
}

const addTask = async (task) => {
  const res = await fetch (`http://localhost:5000/tasks`, {
    method : 'POST',
    headers: {
      'Content-type' : 'application/json'
    },
    body: JSON.stringify(task),
  })

  const data =await res.json()
  // const id = Math.floor(Math.random() * 10000) + 1
  // const newTask = { id, ...task }
  setTasks([...tasks, data])
}
  return (
    <div className="App">
      <Header onAdd = {() => setShowAddTask (!showAddTask)}
      showAdd = {showAddTask}/>
      {showAddTask && <AddTask onAdd = {addTask}/>}
      {tasks.length > 0 ? (
        <Tasks tasks = {tasks} onDelete = {deleteTask} onToggle ={toggleReminder}/>
      ) : (
        'Hết rồi còn gì nữa mà xem'
      )}
    </div>
  );

 
  
}

export default App;
