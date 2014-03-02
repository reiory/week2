import java.util.Scanner;
public class week2_2_3
{
	public static void main(String args[])
	{		
		int opt=0;
		Scanner stdIn=new Scanner(System.in);
		int year=0,i;
		System.out.print("請輸入年份(西元): ");
		year=stdIn.nextInt();
		System.out.println("閏年:");
		for(i = 0;i <= year;i ++)
		{
			if((i%4==0 && i%100!=0)||i%400==0)
				System.out.println(i+"\t");
			;
		}
	}
}
