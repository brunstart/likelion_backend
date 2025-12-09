import { useState } from "react";

const UseStateExam1 = () => {
  console.log("실행");
  //   let count = 0;

  const [count, setCount] = useState(0);
  console.log(count);
  const handleClick = () => {
    // count += 1;
    setCount(count + 1);
  };

  return (
    <div>
      <p>카운트 : {count}</p>
      {/* <button onClick={() => console.log("HI")}>up</button> */}
      <button onClick={handleClick}>up</button>
      {/* <button onClick={console.log("HI")}>up</button> */}
    </div>
  );
};

export default UseStateExam1;
