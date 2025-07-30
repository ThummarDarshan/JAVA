
/*
  next take only single word input
  
  nextline() take all the input till the end of line
  nextInt() takes only integer input
  nextDouble() takes only double input
  nextBoolean() takes only boolean input
  nextfloat() takes only float input
  next() takes only string input

  sout = System.out.println("");  is used to print output
  sc is used to take input from user

  println() is used to print output in new line
  print() is used to print output in same line
  \n is used to print output in new line
  \t is used to print output in tab space
 */



import java.util.*;


class add
{
     int Sum(int a,int b)
    {
        return a+b;
    }
}


public class sum {
    public static void main(String[] args) {
       int a,b,sum;

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        b = sc.nextInt();

       add s = new add();

        System.out.println("Sum is: " + s.Sum(a,b));
    }
}
