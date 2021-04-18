import java.util.Scanner;

/**
 * 
 *e632
 */
public class e632 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		if (min > a) {
			min = a;
		}
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		System.out.println(min);
		
	}

}
