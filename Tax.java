package OPRETOR;
import java.util.Scanner;
public class Tax {
	public static void main (String[]args) {
Scanner input =new Scanner (System.in);
	 System.out .println("enter the  Purchase amount");	
	 // ادخال مبلغ الشراء
	 double Pur =input.nextDouble();
	 double tax = Pur * 0.06;
	 System.out.println("tax$ :  \n " + (int)(tax*100)/100.0);
	 
	 
}
}
