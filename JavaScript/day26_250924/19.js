// ES6 클래스 문법
class Animal {
  constructor(type, name, sound) {
    this.type = type;
    this.name = name;
    this.sound = sound;
  }

  // 메서드는 자동으로 프로토타입에 등록
  say() {
    console.log(this.sound);
  }
}

const dog = new Animal("개", "멍멍이", "멍멍");
const cat = new Animal("고양이", "야옹이", "야옹");

dog.say(); // 멍멍
cat.say(); // 야옹
