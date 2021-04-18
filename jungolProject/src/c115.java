import java.util.Scanner;

/**
 * 
 *115¹ø ¹®Á¦
 *
 */
public class c115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ma = sc.nextInt();
		int mb = sc.nextInt();
		int gc = sc.nextInt();
		int gd = sc.nextInt();
		
		if (ma > gc && mb > gd) {
			System.out.printf("%b",true);
		} else {
			System.out.printf("%b",false);
		}
		
		
	}

}
