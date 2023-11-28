class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }

    static class StaticInnerClass {
        void printInfo() {
            System.out.println("This is a static inner class.");
        }
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); 
        Animal.StaticInnerClass innerClassObj = new Animal.StaticInnerClass();
        innerClassObj.printInfo(); 
    }
}
