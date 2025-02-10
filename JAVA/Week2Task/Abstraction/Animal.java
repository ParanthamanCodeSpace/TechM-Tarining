abstract class Animal {
        public abstract void makeSound();
        }


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
        System.out.println(7*8);
    }
}

// Inheritance - Cat extends Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}


