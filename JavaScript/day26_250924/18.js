function Animal(type, name, sound) {
  this.type = type;
  this.name = name;
  this.sound = sound;
}

Animal.prototype.say = function () {
  console.log(this.sound);
};

// Dog 생성자
function Dog(name, sound) {
  Animal.call(this, "개", name, sound);
}
Dog.prototype = Object.create(Animal.prototype);
Dog.prototype.constructor = Dog;

// Cat 생성자
function Cat(name, sound) {
  Animal.call(this, "고양이", name, sound);
}
Cat.prototype = Object.create(Animal.prototype);
Cat.prototype.constructor = Cat;

const dog = new Dog("멍멍이", "멍멍");
const cat = new Cat("야옹이", "야옹");

dog.say(); // 멍멍
cat.say(); // 야옹
