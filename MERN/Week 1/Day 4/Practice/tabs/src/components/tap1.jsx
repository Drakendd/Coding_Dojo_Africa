import React, { useState } from 'react';

const Tabs =({ items }) => {

  const[activeTab,setActiveTab] = useState(0);

  const handleTabClick = (index) => {
    setActiveTab(index);
  };
  return (
    <div className="tabs">
      <div className="tab-headers">
        {items.map((items,index)=>(
          <div key={index}
          className={`tab-header ${ index === activeTab ? 'active' : '' }`} 
          onClick={() => handleTabClick(index)}>
            {items.label}
          </div>
        ))};
      </div>
      <div className='tab-content'>
        {items[activeTab].content}
      </div>
    </div>
  );
}
  

export default Tabs;