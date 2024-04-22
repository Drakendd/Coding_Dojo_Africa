import React from 'react';
import Tabs from './components/tap1';
import './App.css'

const DataTabs =[
  {label: 'tab1', content : <div>TAB1 CONTENT IS SHOWING HERE</div>},
  {label: 'tab2', content : <div>TAB2 CONTENT IS SHOWING HERE</div>},
  {label: 'tab3', content : <div>TAB3 CONTENT IS SHOWING HERE</div>},
];

function App() {
  return (
    <div className="App">
      <Tabs items={DataTabs} />
    </div>
  );
}

export default App;
