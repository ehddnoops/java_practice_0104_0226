import java.util.Scanner;
/**
 *
 *524¹ø ¹®Á¦
 */
public class c524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean c = (a != 0);
		boolean d = (b != 0);
		 System.out.printf("%b %b",c && d,c || d);
		
	}

}
