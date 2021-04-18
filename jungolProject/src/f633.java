import java.util.Scanner;

/**
 * f633
 * @author ehddn
 *
 */
public class f633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.printf("number? ");
			
			int a = sc.nextInt();
			System.out.println();
			switch(a) {
			case 1:
				System.out.println("Seoul\n");
				break;
			case 2:
				System.out.println("Washington\n");
				break;
			case 3:
				System.out.println("Tokyo\n");
				break;
			case 4:
				System.out.println("Beijing\n");
				break;
			default:
				System.out.println("none\n");
				break;		
			}
			if(a < 1 || a > 4) {
				break;
			}
		}
	}

}
