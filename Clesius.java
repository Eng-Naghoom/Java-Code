package welcome;
import java.util.Scanner;
public class Clesius {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System .out .println("enter the value of fhrenheit");
		double fhr = input.nextDouble();
		double cel=(5.0/9)*(fhr-32);
		System.out.println("fhrenheit is:"+fhr+"\ncelsius is:"+cel);
		
	}

}
