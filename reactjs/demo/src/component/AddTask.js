import { useState } from 'react'

const AddTask = ({onAdd}) => {
    const [text, setText] = useState('')
    const [day, setDay] = useState('')
    const [reminder, setReminder] = useState('')



    const onSubmit = (e) => {
        e.preventDefault()

        if(!text) {
            alert('Vui lòng nhập')
            return
        }

        onAdd({text, day , reminder})
        setText('')
        setDay('')
        setReminder(false)
        alert('Thêm mới thành công')
    }

    return (
        <form className= 'add-form' onSubmit = {onSubmit}>
            <div className ='form-control'>
                <label>Lời nhắc</label>
                <input 
                type ='text' 
                placeholder = 'Lời nhắc' 
                value = {text} 
                onChange = {(e) => setText(e.target.value)}/>
            </div>
            <div className ='form-control'>
                <label>Thời gian</label>
                <input 
                type ='text' 
                placeholder = 'Thời gian' 
                value = {day} 
                onChange = {(e) => setDay(e.target.value)}/>
            </div>
            <div className ='form-control'>
                <label>Chú thích</label>
                <input 
                type ='checkbox'
                checked = {reminder} 
                value = {reminder} 
                onChange = {(e) => setReminder(e.currentTarget.checked)}/>
            </div>
            <input type = 'submit' value= 'Lưu' className= 'btn btn-block'/>
        </form>
    )
}

export default AddTask
