import java.util.Scanner;

class ArmStrongNumber
{
	public static void main(String[] args) 
	{
		int n,arm=0,rem,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
			
	    } 
		if(c==arm)
			System.out.println("Armstrong number");
		else
			System.out.println("not ArmStrong number");
	}
}
