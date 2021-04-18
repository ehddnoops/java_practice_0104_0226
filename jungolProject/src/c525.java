import java.util.Scanner;
/**
 *525¹ø ¹®Á¦
 *
 *
 */
public class c525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		
		
		if (a > b && b > c) {
			System.out.printf("%b ",true);
		} else if (a > b && b == c) {
				System.out.printf("%b ",true);
		} else if (a > b && b < c) {
			System.out.printf("%b ",true);
		}	else {
			System.out.printf("%b ",false);
		}
		
		
		if (a == b && b == c) {
			System.out.printf("%b ",true);
		}
		else {
			System.out.printf("%b ",false);
		}
	}

}
