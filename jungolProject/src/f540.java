import java.util.Scanner;

/**
 * f540
 * @author ehddn
 *
 */
public class f540 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int a = sc.nextInt();
		if (a % 3 == 0) {
			System.out.println(a/3);
		} else if(a == -1) {
			break;
		}
		
		
	}
	}//end of main

}//end of class
