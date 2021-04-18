import java.util.Scanner;

/**
 * 
 * @author ehddn
 *
 */
public class g134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if(a % 2 == 0) {
				even++;
			} else if (a % 2 != 0) {
				odd++;
			}
			
		}
		System.out.printf("even : %d\n",even);
		System.out.printf("odd : %d",odd);
		
		
		
	}

}
