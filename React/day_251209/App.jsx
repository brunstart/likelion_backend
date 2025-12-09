import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import Welcome from "./component/exam/Welcome";
import Hello from "./component/exam/Hello";
import UserInfo from "./component/exam/UserInfo";
import Page from "./component/page/Page";
import UseStateExam1 from "./component/useState/UseStateExam1";
import TextInput from "./component/useState/TextInput";
import Time from "./component/useState/Time";
import UseStateExam2 from "./component/useState/UseStateExam2";

function App() {
  const [count, setCount] = useState(0);
  console.log("dd");

  return (
    <div>
      {/* <Welcome /> */}
      {/* <Hello /> */}
      {/* <UserInfo /> */}
      {/* <Page /> */}
      {/* <UseStateExam1 /> */}
      <TextInput />
      {/* <Time /> */}
      <UseStateExam2 />
    </div>
  );
}

export default App;
