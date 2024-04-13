import React ,{ useState , useEffect} from 'react'
import './styles.css'
import uuid from 'react-uuid';

function Todolist() {
    const [input, setInput] = useState('');
    const [tasks, setTaskes] = useState(JSON.parse(localStorage.getItem('todoList')) || [] );
    const [refrech, setRefrech] = useState(true);

    const onChangeHandler = (e)=>{
        setInput(e.target.value)
    }


    const onSubmiteHandler = (e)=>{
      e.preventDefault();
      if (input){
      setTaskes([...tasks, { task : input, id:uuid(), isComplited : false}]);

    
      setInput('');}}

//delete

      const deletetask = id =>{
      const  lastTasks = tasks.filter(task=>task.id !==id) 
        setTaskes(lastTasks);
      }

      useEffect (()=>{
        localStorage.setItem('todoList',JSON.stringify(tasks))
      },[tasks])


  return (
    <div className='main'>
      <div> 
          <form  onSubmit={onSubmiteHandler}>
              <div><label > add now task</label></div>
              <input type="text" onChange={onChangeHandler} value = {input} />
              <button className='btn' > add</button>
          </form>
      </div>
      <div >

        {tasks.map( (el) => {
            return<div className='task' key={el.id}>
                <p style={el.isComplited ? {textDecoration:'line-through'} :{} }>{el.task}</p>
                <input type="checkbox"  checked={el.isComplited} onChange={e =>{
                  setTaskes((prevTasks) => {
                    const newTasks=prevTasks.map(prevTasks=>prevTasks.task === el.task ?{...el,isComplited:!el.isComplited}:prevTasks);
                    return newTasks;
                  })}}/>

                  <button onClick={()=>{deletetask(el.id)}}>delete</button>

                
            </div>
        })} 



      </div>


    </div>
  )
}

export default Todolist