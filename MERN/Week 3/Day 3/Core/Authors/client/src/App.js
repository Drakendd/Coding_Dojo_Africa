
import './App.css';
import { Routes, Route, Link } from "react-router-dom";
import Add from './components/Add';
import Update from './components/Update';
import List from './components/liste';

function App() {
  return (
    <div className="App">
      <h3>welcome </h3>

      <p><Link to={"/"}>Home</Link></p>
      <p><Link to={"/books/new"}>Add an Author</Link></p>

      <Routes>
        <Route path="/" element={<List/>}/>
        <Route path="/books/new" element={<Add />}/>
        <Route path="/books/edit/:id" element={<Update/>}/>


      </Routes>



    </div>
  );
}

export default App;
