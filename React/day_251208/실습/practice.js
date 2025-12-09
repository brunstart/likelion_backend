// 문제 1: 화살표 함수 변환 (난이도: ⭐)
// 다음 일반 함수들을 화살표 함수의 가장 간결한 형태로 변환하세요.
console.log("======== 문제 1 ========");
// 문제 1-1
function double(x) {
  return x * 2;
}

const doubleArrow = (x) => x * 2;
console.log("doubleArrow : " + doubleArrow(2));

// 문제 1-2
function greet(name) {
  return "안녕하세요, " + name + "님!";
}

const greetArrow = (name) => `안녕하세요 ${name} 님!`;
console.log(greetArrow("yang"));

// 문제 1-3
function add(a, b) {
  return a + b;
}

const addArrow = (a, b) => a + b;
console.log("addArrow : " + addArrow(10, 15));

// 문제 1-4
function getRandomNumber() {
  return Math.random();
}

const getRandomNumberArrow = () => Math.random();
console.log("getRandomNumberArrow : " + getRandomNumberArrow());

// 문제 2: 객체 반환 화살표 함수 (난이도: ⭐⭐)
// 다음 요구사항에 맞는 화살표 함수를 작성하세요.
console.log("========= 문제 2 =========");

// 문제 2-1: 이름과 나이를 받아 객체를 반환하는 함수
// 호출 예: createPerson("김철수", 25)
// 결과: { name: "김철수", age: 25 }

const createPreson = (name, age) => {
  console.log();
};

// 문제 2-2: 할 일 텍스트를 받아 Todo 객체를 반환하는 함수
// 호출 예: createTodo("React 공부하기")
// 결과: { id: (현재 타임스탬프), text: "React 공부하기", completed: false }
