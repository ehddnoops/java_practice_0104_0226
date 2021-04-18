import java.util.Scanner;

/**
 * f539
 *
 */
public class f539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double c = 0;
		double avg = 1;
		
		for(;;) {
			double a = sc.nextDouble();
			sum += a;
			c++;
			avg = sum/c;
			
			if(a >= 100) {
				
				System.out.println(sum);
				System.out.printf("%.1f",avg);
			break;
			} 
		}
		
		
		
		
	}//end of main

}// end of class
