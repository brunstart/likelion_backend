// 단축평가
// 논리연산자 AND - 둘다 참 = 참, 앞이 거짓이면 뒤는 실행 X
// OR - 앞이 참이면 뒤 실행 안함

console.log(true && "hi");
console.log(false && "hi");

console.log(true || "hi");
console.log(false || "hi");

const food = { foodName: "햄버거" };

function getFoodName(food) {
  if (!food) return "아무거나";
  return food.foodName;
}

function getFoodName(food) {
  return food && food.foodName;
}

const foodName = getFoodName(food);
console.log(foodName);

// 자바스크립트가 false라고 판단하는 값들
console.log("" || "hi");
console.log(0 || "hi");
console.log(null || "hi");
console.log(undefined || "hi");

console.log(1 || "hi");

let a;
let b = null;
let c = undefined;
let d = 6;
let e = "test";

let result = a || b || c || d || e;
console.log(result);

let username = "";

username = username || "carami";

console.log(username);

// ?? : 거짓을 값으로만 판단함
console.log("============ ?? ============");
console.log("" ?? "hi");
console.log(0 ?? "hi");
console.log(null ?? "hi");
console.log(undefined ?? "hi");

console.log(1 ?? "hi");
