import java.util.Scanner;

/**
 * 
 *e531¹ø ¹®Á¦
 */
public class e531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		if(a > 88.45) {
			System.out.println("Heavyweight");
		} else if (a > 72.57 && a <= 88.45) {
			System.out.println("Cruiserweight");
		} else if (a > 61.23 && a <= 72.57) {
			System.out.println("Middleweight");
		} else if (a > 50.80 && a <= 61.23) {
			System.out.println("Lightweight");
		} else if (a <= 50.80){
			System.out.println("Flyweight");
		}
		
		
		
		
		
	}

}
