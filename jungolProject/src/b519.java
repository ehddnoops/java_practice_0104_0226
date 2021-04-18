import java.util.Scanner;

/**
 *
 *519¹ø ¹®Á¦
 */
public class b519 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a += 100;
		b = b % 10;
		System.out.printf("%d %d", a , b);
	}
}
