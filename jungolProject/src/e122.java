import java.util.Scanner;

/**
 * 
 *e 122
 */
public class e122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a % 400 == 0) {
			System.out.println("leap year");
		} else if (a % 4 == 0 && a % 100 != 0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
		
	}

}
