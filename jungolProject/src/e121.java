import java.util.Scanner;

/**
 * 
 * e 121
 */
public class e121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("plus");
		} else if (a == 0) {
			System.out.println("zero");
		} else {
			System.out.println("minus");
		}
		
	}
}
