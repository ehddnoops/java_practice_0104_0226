import java.util.Scanner;

/**
 * f128
 * @author ehddn
 *
 */
public class f128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		for(;;) {
			int a = sc.nextInt();
			if (a % 3 != 0 && a % 5 != 0) {
				b++;
			} else if (a == 0) {
				System.out.println(b);
				break;
			}

	
	}
	}

}
