import java.util.Scanner;

/**
 * 
 *f537
 */
public class f537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		while(0 < a) {
			sum += a--;
		}
		System.out.println(sum);
	}

}
