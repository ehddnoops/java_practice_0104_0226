import java.util.Scanner;

/**
 * f126
 * @author ehddn
 *
 */
public class f126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		for(;;) {
			int a = sc.nextInt();
				if(a % 2 ==0 && a != 0) {
					even++;
				} else if(a % 2 == 1) {
					odd++;
				}
				if(a == 0) {
				break;
				}
			
		}
		System.out.printf("odd : %d\n",odd);
		System.out.printf("even : %d",even);
	}
}
