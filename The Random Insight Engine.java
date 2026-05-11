public class The Random Insight Engine {

	public static void main (String[]args) {
		
    final int N=9;
		int x[] =new int [N];
				int i;
				
			for ( i=0;i<x.length;i++) { 
				x[i]=1+(int)(Math.random()*100);
				 	
			}
			int sum=0;
			for ( i=0;i<x.length;i++) {
				
				 sum =sum + x[i];
				
			}
			double avg=(double)sum/x.length;
			
			System.out.println("the sum is "+sum);
			
			System.out.println("the avg is "+avg);
		}
		
}
