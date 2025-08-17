/*
✅ Summary

this → points to the current object of the class.
        Used to access instance variables, call another constructor, or pass current object.

super → points to the parent class object.
        Used to call parent constructors, methods, or fields.
*/

//Call parent class method

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // calls parent method
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
