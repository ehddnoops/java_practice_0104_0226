import java.util.Scanner;

/**
 * 
 * 109¹ø ¹®Á¦
 * 
 */
public class b109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		int avg = (a + b + c) / 3;
		System.out.printf("%s%d\n","sum = ",sum);
		System.out.printf("%s%d","avg = ",avg);
	}

}
