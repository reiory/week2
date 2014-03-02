import java.util.Scanner;
public class week2_2_2
{
	public static void main(String args[])
	{
		Scanner stdIn=new Scanner(System.in);
		double	num1=0.0,num2=0.0;
		int opt=0;
		double sum=0.0;
		System.out.print("The first number: ");
		num1=stdIn.nextDouble();
		do
		{
			System.out.print("The second number: ");
			num2=stdIn.nextDouble();
			if(num2==0.0)
			{
				System.out.print("The second number can't be 0!\n");
			}
		}while(num2==0.0);
		do
		{
			System.out.print("1) +  2) -  3) *  4) / :");
			opt=stdIn.nextInt();				
		}while(opt<0 || opt>5);
		switch(opt)
		{
			case 1:
				sum=num1+num2;
				break;
			case 2:
				sum=num1-num2;
				break;
			case 3:
				sum=num1*num2;
				break;
			case 4:
				sum=num1/num2;
				break;		
			default:
				System.out.print("Error!\n");
				break;
		}
		System.out.print("The result:"+sum);		
	}
}
