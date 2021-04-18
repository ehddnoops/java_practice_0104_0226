import java.util.Scanner;

/**
 * 
 *e529
 */
public class e529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		int c = weight + 100 - height;
		
		System.out.println(c);
		if(c > 0) {
			System.out.println("Obesity");
		}
		
	}

}
