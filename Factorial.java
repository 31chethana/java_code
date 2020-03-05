//program to create user definrd package called 'AdMath'
package AdMath;
import java.util.Scanner;

class Factorial
{
public void m1(int x){
	int num;
	num=x;
	int copy = num;
        int fact = 1;
	while(num>0)
	{
		fact= fact * num;
		num = num-1;
	}
	System.out.println("Factorial of "+copy+" is "+fact);
	
	}

public static void main(String args[])
	{
	Factorial f = new Factorial();
	Scanner s = new Scanner(System.in);
	System.out.print("Enter an integer to calculate its factorial: ");
	int n = s.nextInt();
	f.m1(n);
		
		
	}
	
}






