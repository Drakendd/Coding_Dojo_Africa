import './App.css'
import {Routes, Route} from "react-router-dom"
import Home from './components/Home'
import ShowOne from './components/ShowOne'
import Update from './components/Update'
import Create from './components/Create'

function App() {

  return (
    <>
    <Routes>
      <Route path='/' element={<Home/>} ></Route>
      <Route path='/create' element={<Create/>} ></Route>
      <Route path='/product/:id' element={<ShowOne/>} ></Route>
      <Route path='/product/update/:id' element={<Update/>} ></Route>
    </Routes>
    </>
  )
}

export default App
