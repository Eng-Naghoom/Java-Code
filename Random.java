package MK;

public class Random {
	public static void main (String[]args) {
		char v;
		v= rand('X','D');
		System .out .println(v)	;	
	}
	public static char rand ( char b,char a) {
		char n ;
		n= (char)( a+  Math.random()*(b-a+1));
		return n;
	}
}
