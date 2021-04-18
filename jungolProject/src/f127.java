import java.util.Scanner;

/**
 * f127
 * @author ehddn
 *
 */
public class f127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 1;
		double b = 0;
		for(;;) {
			int a = sc.nextInt();
			if(a >= 0 && a <=100) {
				sum += a;
				b++;
				avg = sum/b;
			} else {
				System.out.printf("sum : %d\n",sum);
				System.out.printf("avg : %.1f",avg);
				break;
			}
			
			
		}
	}

}
