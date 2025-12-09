// alert("hello");

console.log("hello");

let msg = sayHello("carami");
console.log(msg);

function sayHello(name) {
  return `안녕하세요, ${name}님`;
}

// const로 function 선언 시 호이스팅 안됨
// console.log(greet("hoho"));
const greet = function (name) {
  return `안녕하세요, ${name}님!`;
};

console.log(greet("hoho"));

// 화살표 함수
const greet2 = (name) => {
  return `안녕하세요, ${name}님!!`;
};

console.log(greet2("arrow function"));

const greet3 = (name) => `안녕하세요, ${name} 님!!!`;

const calculateArea = (width, height) => width * height;
// const calculateArea2 = (width, height) => { width * height; };  // 중괄호가 있는 경우 return이 있어야함

console.log(calculateArea(10, 30));

// ❌ 잘못된 방법 - 중괄호가 함수 본문으로 해석됨
// const createUser = (name) => { name: name };  // undefined 반환!

// ✅ 올바른 방법 - 소괄호로 감싸기
const createUser = (name) => ({ name: name });
const createUser2 = (name) => ({ name });

// 또는 풀어서 작성
// const createUser = (name) => {
//   return { name: name };
// };

console.log(createUser("김철수")); // { name: "김철수" }
console.log(createUser2("박영희"));

const createTodo = (text) => ({
  id: Date.now(),
  text, // text: text == text
  done: false,
});

const todo1 = createTodo("리액트 공부하기");
const todo2 = createTodo("자바스크립트 복습하기");

console.log("할일 1: " + todo1.text);
console.log("할일 2: " + todo2.text);

// 위에 정의한 create
// let color = red;
// {color:color} == {color}

const user = {
  name: "김철수",

  // 일반 함수: this = 호출한 객체 (user)
  greetNormal: function () {
    console.log(`안녕하세요, ${this.name}입니다.`);
  },

  // 화살표 함수: this = 상위 스코프의 this
  greetArrow: () => {
    console.log(`안녕하세요, ${this.name}입니다.`);
  },

  delayedGreetNormal: function () {
    setTimeout(function () {
      console.log(`setTimeout function() ${this.name}님 hello`); // 실행되는 시점에 나는 누구인지 판단함 (동적 binding)
    }, 100);
  },

  deleyedGreetArrow: function () {
    setTimeout(() => {
      console.log(`setTimeout function() ${this.name}님 hello~`);
    }, 100);
  },
};

user.greetNormal(); // 안녕하세요, 김철수입니다.
user.greetArrow(); // 안녕하세요, 입니다.

// user.delayedGreetNormal();
// user.deleyedGreetArrow();

// this가 결정되는 시점이 function과 화살표함수가 다름
// 화살표함수 : 자기가 태어날 때 감싸고 있는걸 찾음 --> user => this가 정적으로 binding됨
