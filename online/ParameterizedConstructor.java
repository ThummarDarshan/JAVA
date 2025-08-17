class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();

        Student s2 = new Student("Bob", 22);
        s2.display();
    }
}
