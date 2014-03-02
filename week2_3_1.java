import java.io.*; 
import java.util.*;

public class week2_3_1 {

	public static void main (String[] args) {
		int option = 0, n = 0;
		Scanner a = new Scanner(System.in);
		double r[][] = new double[1][1];
		while(true) {
			System.out.print("1)新增 2)查詢 -1)結束 ");
			option = a.nextInt();
			switch(option) {
				case 1 :
					System.out.print("請輸入數量： ");
					n = a.nextInt();
					r = new double[n][2]; 
					/*for(int i = 0; i < n; i++) {
						r[i] = new double[2];
					}*/					
					System.out.println("請輸入編號與半徑： ");
					for(int j = 0; j < n; j++) {
						for(int i = 0; i < 2; i++) {
							r[j][i] = a.nextDouble();
						}
					}
						break;
				case 2 :
					int i = 0;
					double id = 0.0, ang = 0.0;
					Circle c = new Circle();
					System.out.println("請輸入編號與角度： ");
					id = a.nextDouble();
					ang = a.nextDouble();
					for(i=0; i<n; i++) { 
						if(id == r[i][0]) {
							c.radius = r[i][1];
							c.angle = ang;
							System.out.println("\n編號\t半徑\t弧長\t面積 ");
							System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+c.Arc()+"\t"+c.Pie()+"\n");
							break;
						}
					}
					break;
				case -1 :
					return;
			}
		}

	}

}

class Circle {
	double radius = 0.0, angle = 0.0;

	double Arc() { 
		return 2 * 3.14 * radius * angle/360;
	}
	double Pie() { 
		return 3.14 * radius * radius;
	}
}
