import java.util.Scanner;

/**
 * g545
 * @author ehddn
 *
 */
public class g545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if(a % 3 == 0) {
				b++;
			} if(a % 5 == 0) {
				c++;
			}
			
		}
		System.out.print("Multiples of 3 : " + b);
		System.out.println();
		System.out.print("Multiples of 5 : " + c);
	}

}
