import { MdDeleteSweep} from 'react-icons/md'
const Task = ({task , onDelete , onToggle}) => {
    return (
        <div 
        className = {`task ${task.reminder ? 
        'reminder' : ''}`} 
        onDoubleClick = {() => onToggle(task.id)}>
            <h3>{task.text} <MdDeleteSweep style ={{ color :'red' , cursor: 'pointer'}} onClick = {() => window.confirm("Bạn có chắc chắn muốn xóa lời nhắc này ?")
             && onDelete(task.id)}/>
            </h3>
            <p>{task.day}</p>
        </div>
    )
}

export default Task
