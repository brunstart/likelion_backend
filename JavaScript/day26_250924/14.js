// forEach(함수) -- 요소를 하나씩 꺼내서 함수를 실행해주는 일
// console.log("===================================");
const array = [1, 2, 3, 4, 5];

// 1. 함수 풀어씀
// function print(number) {
//   console.log(number);
// }

// 2. 화살표 함수
const print = (number) => console.log(number);

array.forEach(print);

// 3. forEach 내부에 화살표 함수
array.forEach((n) => console.log(n));

// array 배열의 요소에 (n*n) 한 결과 배열을 새로 만들고 싶다. [1, 4, 9, 16, ...]

const resultArr = [];

for (let i = 0; i < array.length; i++) {
  resultArr.push(array[i] * array[i]);
}
console.log(resultArr);

// forEach 사용 -- 각각 요소에다가 무언가(함수)를 하는 역할
console.log("================ forEach ==================");

const resultArr2 = [];
array.forEach((n) => resultArr2.push(n * n));

console.log(resultArr2);

// map 사용 -- 각 요소에 무언가(함수)를 하고 변경한 값들을 새 배열에 반환.
console.log("================== map ====================");

const resultArr3 = array.map((n) => n * n);
console.log(resultArr3);

// filter -- 참인것만 배열에 담아서 리턴. (필터링, 조건선별)
console.log("================ filter ===================");
const resultArr4 = array.filter((n) => n % 2 === 0);
console.log(resultArr4);

// const array = [1, 2, 3, 4, 5];
// reduce -- 값을 누적하는 함수 / a : 누적값, c : 다음요소, {} : 두개로 수행할 함수, 0 : a의 초기값(생략 시 첫번째 요소로 설정)
console.log("================= reduce ==================");
let sum = array.reduce((a, c) => {
  //   console.log(a);
  return a + c;
}, 0);

console.log(sum);

// find : 해당 값을 찾음
console.log("================== find ===================");
const users = [
  { id: 1, name: "김철수" },
  { id: 2, name: "이영희" },
  { id: 3, name: "박민수" },
];

const user = users.find((u) => u.id === 2);
console.log(user);

// findIndex : 해당 값의 인덱스를 반환 (인덱스는 0부터 시작)
console.log("================ findIndex ================");

const idx = users.findIndex((u) => u.id === 2);
console.log(idx);

// splice : 원본 배열 수정
console.log("================= splice ==================");
const numbers = [10, 20, 30, 40];
const index = numbers.indexOf(30);
numbers.splice(index, 1);
console.log(numbers);

// slice
console.log("================= slice ===================");
const arr = [10, 20, 30, 40];
const sliced = arr.slice(0, 2); // 0부터 2전까지
console.log(sliced);
console.log(arr);

const numbers2 = [10, 20, 30, 40];

// shift - 첫 번째 요소 제거 및 반환
console.log("================= shift ===================");
const first = numbers.shift();
console.log(first); // 10
console.log(numbers); // [20, 30, 40]

// pop - 마지막 요소 제거 및 반환
console.log("================== pop ====================");
const last = numbers.pop();
console.log(last); // 40
console.log(numbers); // [20, 30]

// unshift - 앞에 추가
console.log("================ unshift ==================");
numbers.unshift(5);
console.log(numbers); // [5, 20, 30]

// concat - 배열 합치기
console.log("================= concat ==================");
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const combined = arr1.concat(arr2);
console.log(combined); // [1, 2, 3, 4, 5, 6]

// join - 문자열로 합치기
console.log("================== join ===================");
const array2 = [1, 2, 3, 4, 5];
console.log(array2.join()); // "1,2,3,4,5"
console.log(array2.join(" ")); // "1 2 3 4 5"
console.log(array2.join(" - ")); // "1 - 2 - 3 - 4 - 5"

const fruits = ["사과", "바나나", "오렌지", "포도"];

// indexOf - 인덱스 찾기
console.log("================ indexOf ==================");
console.log(fruits.indexOf("바나나")); // 1
console.log(fruits.indexOf("수박")); // -1 (없음)

// includes - 포함 여부 확인
console.log("================ includes =================");
console.log(fruits.includes("오렌지")); // true
console.log(fruits.includes("수박")); // false
