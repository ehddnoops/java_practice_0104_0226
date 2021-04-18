import java.util.Scanner;

/**
 * g546
 * @author ehddn
 *
 */
public class g546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double b = 0;
		double c = 1;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			b += a;
			c = b/n;
		
		}

		String d = c >= 80 ? "pass" : "fail";
		System.out.printf("avg : %.1f\n",c);
		System.out.printf(d);
	}

}
