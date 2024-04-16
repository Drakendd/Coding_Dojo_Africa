import React from "react";
import './App.css';
import Home from "./components/Home";
import Word from "./components/Word";
import Number from "./components/Number";

import {
  Routes,
  Route
} 
from "react-router-dom";
function App() {
  return (
    <div className="react">
      
      <Routes>
        <Route path="/home" element={<Home />}/>
        <Route path="/:word" element={<Word />}/>
        <Route path="/:txt/:bg/:colortext" element={<Number />}/>
      </Routes>
    </div>
  );
}
export default App;