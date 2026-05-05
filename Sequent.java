package MK;

public class Sequent {
  
	public static void main (String[]args) {
    
		int s=1;
		for (int i=2,j=3 ; i<=10 && j<=11 ; i+=2,j+=2) {
      
			double k =((double)(i * 100/j))/100;
      
			s*=-1;
			System.out.println((s>0 ?"+":"-")+ i +"/"+j+ "="+k);
		}
		
	}

}
