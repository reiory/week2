import java.io.*;
import java.util.Scanner;

class week2_4_1{
	public static void main(String[] args)
	{
		int option = 0;
		do{
			System.out.println("1)進行計算 2)退出 : ");
			Scanner op = new Scanner(System.in);
			option = op.nextInt();
			switch(option)
			{
				case 1:
					System.out.println("輸入圓形或是橢圓形半徑來找出它的面積\n");
					Circle[] cir = new Circle[20];
					int count=0;
					while(true)
					{
						System.out.println("1)輸入圓形 2)輸入橢圓形 -1)退出(印出結果) : ");
						Scanner keyin = new Scanner(System.in);
						int ch = keyin.nextInt();
						if(ch == -1)
							break;
						else if(ch == 1)
						{
							System.out.println("輸入圓半徑 : ");
							double r = keyin.nextDouble();
							cir[count++] = new Circle(r);
							break;
						}
						else if(ch == 2)
						{
							System.out.println("輸入橢圓半徑 (以Enter隔開) : ");
							double rad1 = keyin.nextDouble();
							double rad2 = keyin.nextDouble();
							cir[count++] = new Oval(rad1,rad2);
							break;
						}
						else
							System.out.println("輸入錯誤!\n");
					}
					for(int i = 0; i < count; i++)
						cir[i].Print();
					break;
				case 2:
					break;
			}
		}while(option == 1);
	}
}

class Circle{
	protected double r1;

	public Circle(double x)
	{
		r1 = (x>0)?x:0;
	}

	public double Area()
	{
		return Math.PI * r1 *r1;
	}

	public void Print()
	{
		System.out.println("Circle面積 : " + Area());
	}
}

class Oval extends Circle
 {
	double r2;
	Oval(double x,double y)
	{
		super(x);
		this.r2=y;
	}
	double area() 
	{ 
		return 3.14 * r1 * r2; 
	}
	void show()
	{
		System.out.print("\n\n長軸長度="+r1+"短軸長度="+r2+"  面積:"+area());
	}
 }
