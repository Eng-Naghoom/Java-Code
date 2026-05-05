package MK;

public class Fact {
	public static void main (String[]args) {
		long m;
	m=	factorial (9);
	 System.out.println(m)	;
		
	}
	public static long factorial (int k) {  
		if(k==0) {
			return 1;}
		else {
		long result =1;
		for (int i=k ; i>=1 ; --i) { 
			result *=i; 
		
			} 
		return result;
		}
	}
}
