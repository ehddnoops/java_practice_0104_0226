import java.util.Scanner;

/**
 * g136
 * @author ehddn
 *
 */
public class g136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		for (int i = 1; i < 11; i++) {
			b = a * i;
			System.out.printf("%d ",b);
			
		}
		
	}

}
