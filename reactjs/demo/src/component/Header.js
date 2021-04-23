import PropTypes from 'prop-types'
import Button from './Button'

const Header = ({title , onAdd , showAdd}) => {
    const onClick = () => {
        console.log('add')
    }
    return (
        <header className = 'header'>
            <h1>{title}</h1>
            <Button 
            color = {showAdd ? 'red' : 'green'}
            text = {showAdd ? 'Đóng' : 'Thêm mới'}
            onClick = {onAdd}/>
        </header>
    )
}

Header.defaultProps = {
    title : 'Lời nhắc',
}

Header.propTypes = {
    title : PropTypes.string.isRequired,
}
export default Header
