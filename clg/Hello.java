import java.util.Scanner; // this is packge for the scanner class and import the scanner class
import java.util.Scanner;

class Intrest
{
	float p ,r,t;
	float i(float p, float r, float t)
	{
		return (p*r*t)/100;
	}
}


class Max
{
	int a ,b,c;
	int max(int a, int b, int c)
	{
		return (a>b) &&(a>c) ? a : ((b>c) ) ? b : c;
	}
}

public class Hello //for the run code we need to smae name of class and file name
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// Intrest in   = new Intrest();
		Intrest in =  new Intrest();
		System.out.println("Enter principle Ammount of Intrest : ");
		float p = sc.nextFloat();
		System.out.println("Enter  Rate of Intrest : ");
		float r = sc.nextFloat();
		System.out.println("Enter Time of Intrest : ");
		float t = sc.nextFloat();
		
		Scanner sc1 = new Scanner(System.in);
		Max  m = new Max();
		
		System.out.println("Enter 1st Number : ");
		int a = sc1.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = sc1.nextInt();
		System.out.println("Enter 3rd Number : ");
		int c = sc1.nextInt();

		//System.out.println("Simple Interest is : "+in.i(1000,12,5));//loseing conversion
		System.out.println("Simple Interest is : "+in.i(p,r,t));//loseing conversion
		System.out.println("Max number is : " + m.max(a,b,c));
	}
}
