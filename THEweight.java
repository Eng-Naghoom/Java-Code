 package opreat;
import java.util.Locale;
import java.util.Scanner;
public class THEweight {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
	Scanner input =new Scanner(System.in);
	System.out.println( "enter your name");
	String name=input.nextLine();
    System.out.println("enter your age");
	int age=input.nextInt();
	System.out.println("enter your waith");
	double waith=input.nextDouble();
	System.out.println("enter your lenght");
	double lenght=input.nextDouble();
	double bmi;
	bmi=waith/(lenght*lenght);
	System.out.printf("name is %s%n",name );
	System.out.printf("age is %d%n",age );
	System.out.printf("waith is %.2f%n",waith );
	System.out.printf("lenght is %.2f%n",lenght );
	System.out.printf("bmi is %.2f%n",bmi );
	if(bmi<18.5) {
			System.out.println("under waigth");
		}
	else if(bmi>= 18.5 && bmi<=24.9) {
			System.out.println("healthy weight");}
	else {
			System.out.println("no healthy weight");
			}
		}
}

	
		
		
	


