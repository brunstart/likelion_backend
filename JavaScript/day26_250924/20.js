console.log("시작");

function work() {
  console.log("work 작업 시작");
  const start = Date.now();

  for (let i = 0; i < 1000000000; i++) {}
  const end = Date.now();
  console.log("work 작업 끝");
  console.log(end - start + "ms");
}

// work();
setTimeout(work, 3000);

console.log("다음작업");

function hi() {
  console.log("hi");
}

hi();

console.log("다음 핳 일 1");
console.log("다음 할 일 2");

console.log("끝");
