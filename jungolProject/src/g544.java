import java.util.Scanner;

/**
 * g544
 * @author ehddn
 *
 */
public class g544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		for (int i = a+1; i <= 100; i++) {
			b += i;
		}
		System.out.println(b);
	}

}
