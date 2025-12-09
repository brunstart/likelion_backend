import Hello from "./Hello";

// const Welcome = () => <h1> 안녕!! 난 리액트야. </h1>;

function Welcome({ name }) {
  return (
    <div>
      <h1>안녕! 난 리액트야.</h1>
      <h2>haha</h2>

      <Hello name={"김철수"} />
      <Hello name={"이영희"} />
      <Hello name={"박민수"} />
    </div>
  );
}

export default Welcome;
