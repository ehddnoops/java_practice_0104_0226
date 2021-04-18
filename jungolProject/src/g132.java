import java.util.Scanner;

/**
 * g132
 * @author ehddn
 *
 */
public class g132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		for (int i = 0; i <= a; i++) {
			if(i % 5 == 0) {
				b += i;
			}
			
		}
		System.out.println(b);
	}

}
