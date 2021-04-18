import java.util.Scanner;

/**
 * f129
 * @author ehddn
 *
 */
public class f129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.printf("%s","Base = ");
			double Base = sc.nextInt();
			System.out.printf("%s","Height = ");
			double Height = sc.nextInt();
			double Triangle = (Base * Height)/2;
			System.out.printf("%s%.1f\n","Triangle width = ",Triangle);
			System.out.printf("%s","Continue? ");
			
			String a = sc.next();
			if (a.equals("Y") || a.equals("y")) {
			continue;	
			}
			else {
				break;
			}
		}
		
		
	}//end of main

}//end of class
