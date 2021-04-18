import java.util.Scanner;

/**
 * g133
 * @author ehddn
 *
 */
public class g133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < a; i++) {
			double b = sc.nextInt();
			sum = b+sum;
		}
		
		double avg = sum/a;
		System.out.printf("%.2f",avg);
	}

}
