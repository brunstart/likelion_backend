// for...of (배열 요소 순회)
const fruits = ["사과", "바나나", "오렌지"];
for (let fruit of fruits) {
  console.log(fruit);
}

// for...in (객체 속성 순회) : 객체 아니면 굳이 for in 쓸 필요는 없다
const person = { name: "김철수", age: 25 };
for (let key in person) {
  console.log(`${key}: ${person[key]}`);
}

// 배열의 합 구하기
function sumOf(numbers) {
  let sum = 0;
  for (let i = 0; i < numbers.length; i++) {
    sum += numbers[i];
  }
  return sum;
}

const result = sumOf([1, 2, 3, 4, 5]);
console.log(result); // 15

// 3의 배수만 출력하기
for (let i = 1; i <= 20; i++) {
  if (i % 3 === 0) {
    console.log(i); // 3, 6, 9, 12, 15, 18
  }
}
