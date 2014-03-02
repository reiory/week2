import java.util.Scanner;
public class week2_3_2
{
	public static void main(String args[])
	{
		int year,month,day;
		Scanner stdIn=new Scanner(System.in);
		System.out.print("Year:");
		year=stdIn.nextInt();
		System.out.print("Month:");
		month=stdIn.nextInt();
		System.out.print("Day:");
		day=stdIn.nextInt();
		Date sure=new Date(year,month,day);
		sure.show();
		sure.isVaild();
	}
}
class Date
{
	int year,month,day;
	Date(int year,int month,int day)
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
	void show()
	{
		System.out.print("\n 判斷日期\n");
		System.out.print("\n year:"+year+"\n month:"+month+"\n day:"+day);
		System.out.print("\n ------------------\n");
	}
	void isVaild()
	{
		if(year<0)
			System.out.print("\nYear is Invalid!\n");
		else
			System.out.print("\nYear is Correct!\n");
		if(month>0 && month<=12)
			System.out.print("Month is Correct!\n");
		else
			System.out.print("Month is Invalid!\n");
		if(month ==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12)
		{
			if(day>0 && day<=31)
				System.out.print("Day is Correct!\n");
			else
				System.out.print("Day is Invalid\n");
		}
		else if(month ==2)
		{
			if(day>0 && day<=28)
				System.out.print("Day is Correct!\n");
			else
				System.out.print("Day is Invalid!\n");		
		}			
		else if(month ==4 || month ==6 || month ==9 || month ==11 )
		{
				if(day>0 && day<=30)
					System.out.print("Day is Correct!\n");
				else
					System.out.print("Day is Invalid!\n");
		}	
		else
			System.out.print("Day is Invalid!\n");

	}
}
