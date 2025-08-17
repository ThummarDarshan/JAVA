//Call another constructor in the same class

class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0); // calls parameterized constructor
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();        // calls default constructor
        Student s2 = new Student("Bob", 22); 
        s1.display();
        s2.display();
    }
}
