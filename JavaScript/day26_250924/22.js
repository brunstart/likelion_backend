function work() {
  console.log("work start");

  setTimeout(() => {
    console.log("setTimeout() start");
  }, 1000);
  console.log("work end");
}

work(); // 실제 하고 싶은 work() 함수가

// work 함수가 호출 될때 끝난 다음에 할일을 같이 보내야함.

// setTimeout() 이 끝난 다음에 실행하고 싶은 일이 있다면
