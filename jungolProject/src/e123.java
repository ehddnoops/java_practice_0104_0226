import java.util.Scanner;

/**
 * 
 *e123
 */
public class e123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s","Number? ");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
		}
	}

}
