import java.util.Scanner;
import java.util.*;
public class Homework2_2_4
{
	public static void main(String args[])
	{

		ArrayList<String> name=new ArrayList<String>();
		int [] grade=new int[10];
		String g,a;
		int i,count=0,id,opt=0;
		Scanner stdIn=new Scanner(System.in);

		while(true){
					System.out.print("1)Insert 2)Search 3)End?\n");
					opt=stdIn.nextInt();
					switch(opt)
					{
						case 1:
							System.out.print("請輸入" + count +"編號的學生姓名 (-1 結束)\n");
							a=stdIn.next();
							if( a.equals("-1")==true )
								break;
							else
								name.add(a);
							while(true){		
								try
								{
									System.out.print("成績:");
									g=stdIn.next();
									grade[count]=Integer.parseInt(g);
									count++;
								}
								catch(NumberFormatException e)
								{
									System.out.print("請輸入數字!\n");
									continue;
								}
								break;
							}
							break;
						case 2:
							System.out.print("輸入學生編號：");
							id =stdIn.nextInt();
							if(id >= 0 &&id < count)
							{
								System.out.print("\n編號\t姓名\t成績\n");
								System.out.print(id+"\t"+name.get(id)+"\t"+grade[id]+"\n");
							}
							else
								System.out.print("Not found ! \n");
							break;
						case 3:
							return;
						default:
							continue;
				   } //switch
		} //while
	}
}
