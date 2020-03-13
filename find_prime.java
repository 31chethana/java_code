import java.util.Scanner;
class find_prime{
	public static void main(String args[]){
		int num;
		boolean isprime = true;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
        num = s. nextInt();
		for(int i = 2; i <= num/i; i++){
			if(num%i == 0){
			isprime = false;
			break;
			}
		}
	
	if(isprime) 
		{System.out.println("Prime");}
	else
		{System.out.println("Not Prime");}
}	
}
