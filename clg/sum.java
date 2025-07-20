import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :-");
        x = sc.nextInt();
        System.out.println("Enter the second number :-");
        y = sc.nextInt();
        z = x + y ;
        System.out.println("Sum of the two numbers is " + z);
    }
}
