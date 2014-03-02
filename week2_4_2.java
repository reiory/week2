import java.util.*;
public class week2_4_2
{
	public static void main(String args[])
	{
		ArrayList<Shape> arrayList=new ArrayList<Shape>();
		Scanner stdIn=new Scanner(System.in);
		int opt,count=0;
		double x=0.0,y=0.0;
		do
		{
			System.out.print("\n1)Circle 2)Oval 3)Rectangle 4)Triangle -1)Exit:");
			opt=stdIn.nextInt();
			switch(opt)
				{
					case 1:
						Circle circle;
						System.out.print("\n半徑: ");
						x=stdIn.nextDouble();				
						circle=new Circle(x);
						arrayList.add(circle);
						count++;
						break;
					case 2:
						Oval oval;
						System.out.print("\n長軸: ");
						x=stdIn.nextDouble();
						System.out.println("左軸: ");
						y=stdIn.nextDouble();
						oval=new Oval(x,y);
						arrayList.add(oval);
						count++;
						break;
					case 3:
						Rectangle rectangle;
						System.out.print("\n長: ");
						x=stdIn.nextDouble();
						System.out.print("寬: ");
						y=stdIn.nextDouble();
						rectangle=new Rectangle(x,y);
						arrayList.add(rectangle);
						count++;
						break;
					case 4:
						Triangle triangle;
						System.out.print("\n底: ");
						x=stdIn.nextDouble();
						System.out.print("高: ");
						y=stdIn.nextDouble();
						triangle=new Triangle(x,y);
						arrayList.add(triangle);
						count++;
						break;
					case -1:
						break;
					default:
						System.out.print("ERROR!\n");
						break;
				}
				for(int i=0;i<count;i++)
				{
					arrayList.get(i).show();
				}
		}while(opt!=-1);
	}
}
abstract class Shape
{
	abstract void show();
}
class Circle extends Shape
{
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	void show()
	{
		System.out.print("\n形狀:圓形\n");
		System.out.print("面積:"+ 3.14*r*r );
	}
}
class Oval extends Shape
{
	double x,y;
	Oval(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.print("\n形狀:橢圓形\n");
		System.out.print("面積:"+ 3.14*x*y );
	}
}
class Rectangle extends Shape
{	
	double x,y;
	Rectangle(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.print( "\n形狀:長方形\n" );
		System.out.print( "面積:" + x*y );
	}
}
class Triangle extends Shape
{
	double x,y;
	Triangle(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.print( "\n形狀:三角形\n" );
		System.out.print( "面積:" + x*y/2 );
	}
}
