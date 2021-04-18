import java.util.Scanner;

/**
 * 
 *e530
 */
public class e530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int a = 20 - age;
		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.printf("%d years later",a);
		}
		
		
		
	}

}
