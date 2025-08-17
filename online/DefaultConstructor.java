class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}

