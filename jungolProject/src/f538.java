import java.util.Scanner;

/**
 * f538
 *
 */
public class f538 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		System.out.printf("%s","number? ");
		int a = sc.nextInt();
		if(a > 0) {
			System.out.println("positive integer");
			
		} else if (a < 0) {
			System.out.println("negative number");
		}else { 
			break;
		}
		}
	}

}
