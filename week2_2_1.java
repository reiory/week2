import java.io.*; 
import java.util.Scanner;

class week2_2_1 {
  public static void main(String[] args) {
  int[] birth = {0,0,0};
   System.out.println("請輸入姓名 : ");
   BufferedReader buf = new BufferedReader ( new InputStreamReader ( System.in ) );
	String name = buf.readLine();	
	System.out.println("請輸入西元生日：");
	Scanner a = new Scanner(System.in);
	for(int i = 0; i < 3; i++){
		birth[i]=a.nextInt();
	}
	birth[0]=birth[0]-1911;
	System.out.println(name + "您好"); 
	System.out.println("\r\n您的生日為民國" + birth[0] + "年" + birth[1] + "月" + birth[2] + "日");
	}
}
