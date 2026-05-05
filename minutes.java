package welcome;
import java .util.Scanner;
public class minutes {
	public static void main (String []args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter the numbers of seconds");
	 //تعريف متغير للثواني
	 int sec= input.nextInt();
	 // تعريف تغيير للدقائق
	 int min= sec/60;
	 int secm=sec%60;
	 System.out.println("\nseconds is:"+sec+"\nminutes is:"+min+"\nsecm is:"+secm);
			 
	 
	}

}
