
package welcome;
import java.util.Scanner;
public class thesmartAccumulator {
	public static void main (String[]args) {
		 Scanner input=new Scanner (System.in);
		 System.out.println("enter the number 1 ");
		 int num ;
		 double sum =0;
		 //ادخال اول رقم
		 num =input.nextInt();
		 
		 //جملة اللوب
		 while (num >= 0) {
			 sum +=num;
			 
			 System.out.println("enter the number 2 ");
			 
			 num =input.nextInt();
		 }
		 
		 System.out.println("THE SUM IS:  "+sum); 
		 input.close();
	}
}
