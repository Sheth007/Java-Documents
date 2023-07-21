/*Write a menu driven program which has following operations:
a. Factorial.
b. Number is Even or Odd.
c. Exit.*/
import java.util.Scanner;
class assi6
{
	public static void main(String[] args)
	{
		System.out.println("-----Menu-----");
		System.out.println("1) Factorial");
		System.out.println("2) Odd and Even");
		System.out.println("3) Exit");
		System.out.println("Choose the number:");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter a number:");
			int n=sc.nextInt();
			int temp=n;
			int gar=n;
			for(int i=2;i<=n;i++)
			{
				gar--;
				temp=temp*gar;	
			}
			System.out.println("Factorial of "+n+ " is: "+temp);
		}
		if(ch==2)
		{
			System.out.println("Enter a Number:");
			int a=sc.nextInt();
			if(a==0)
				System.out.println("Number is 0");
			else if(a%2==0)
				System.out.println("Number is Even");
			else
				System.out.println("Number is Odd");
		}
	}
}
			
				
		