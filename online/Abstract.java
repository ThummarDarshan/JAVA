/*
What is abstract in Java?
  The abstract keyword is used with classes and methods.
  It helps implement abstraction (hiding implementation details and showing only essential features).

Abstract Class :-
  Declared using abstract keyword.
  Cannot be instantiated (you cannot create objects directly).
  May contain abstract methods (without body) and concrete methods (with body).
  Subclasses must implement (override) the abstract methods.

Abstract Method :-
  Declared using abstract keyword.
  Has no body (only declaration).
  Must be overridden in a subclass.

Key Points :-
  Abstract class can have both abstract and non-abstract methods.
  Abstract method has no body → must be implemented by subclasses.
  You cannot create objects of an abstract class.
  If a class has even one abstract method, it must be declared abstract.
*/
// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass must implement abstract method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ❌ Not allowed (abstract class)
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();   // Dog barks
        d.sleep();   // Sleeping...
        
        c.sound();   // Cat meows
        c.sleep();   // Sleeping...
    }
}
