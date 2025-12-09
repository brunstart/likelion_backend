import Calculator from "./Calculator.js"; // default export는
import { add, PI, USER_NAME } from "./utils.js";

console.log(PI);
console.log(USER_NAME);

const result = add(3, 6);
console.log(result);

const cal = new Calculator();

let sum = cal.add(2, 4);
console.log(sum);

// map()
console.log("=========== map() : 변환 ===========");

const numbers = [1, 2, 3, 4, 5];

const doubled = numbers.map((num) => num * 2);
console.log(doubled); // [2, 4, 6, 8, 10]

const users = [
  { name: "김철수", age: 25 },
  { name: "이영희", age: 30 },
];

const names = users.map((user) => user.name);
console.log(names); // ["김철수", "이영희"]

// filter()
console.log("=========== filter() : 필터링 ===========");

const numbers2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const evenNumbers = numbers2.filter((num) => num % 2 === 0);
console.log(evenNumbers); // [2, 4, 6, 8, 10]

const users2 = [
  { name: "김철수", age: 25 },
  { name: "이영희", age: 30 },
  { name: "박민수", age: 20 },
];

const adults = users2.filter((user) => user.age >= 25);
console.log(adults);
// [{ name: "김철수", age: 25 }, { name: "이영희", age: 30 }]

// find()
console.log("=========== find() : 찾기 ===========");
const users3 = [
  { id: 1, name: "김철수" },
  { id: 2, name: "이영희" },
  { id: 3, name: "박민수" },
];

const user = users3.find((u) => u.id === 2);
console.log(user); // { id: 2, name: "이영희" }

const notFound = users3.find((u) => u.id === 99);
console.log(notFound); // undefined

// findIndex()
console.log("=========== findIndex() : 인덱스 찾기 ===========");
const numbers4 = [10, 20, 30, 40, 50];

const index = numbers4.findIndex((num) => num > 25);
console.log(index); // 2 (30의 인덱스)

const notFound4 = numbers4.findIndex((num) => num > 100);
console.log(notFound4); // -1 (없음)

//some()/every()
console.log("=========== some()/every() : 조건확인 ===========");
const numbers5 = [1, 2, 3, 4, 5];

// some: 하나라도 조건을 만족하면 true
const hasEven = numbers5.some((num) => num % 2 === 0);
console.log(hasEven); // true

// every: 모두 조건을 만족해야 true
const allPositive = numbers5.every((num) => num > 0);
console.log(allPositive); // true

const allEven = numbers5.every((num) => num % 2 === 0);
console.log(allEven); // false

//reduce()
console.log("=========== reduce() : 누적 ===========");
const numbers6 = [1, 2, 3, 4, 5];

// 합계
const sum6 = numbers6.reduce((acc, cur) => acc + cur, 0);
console.log(sum6); // 15

// 최대값
const max = numbers6.reduce((acc, cur) => Math.max(acc, cur), numbers6[0]);
console.log(max); // 5

// 객체로 그룹화
const items = ["사과", "바나나", "사과", "딸기", "바나나", "사과"];

const count = items.reduce((acc, item) => {
  acc[item] = (acc[item] || 0) + 1;
  return acc;
}, {});

console.log(count); // { 사과: 3, 바나나: 2, 딸기: 1 }
