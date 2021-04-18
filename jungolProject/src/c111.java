import java.util.Scanner;

/**
 * 111¹ø ¹®Á¦
 * 
 */
public class c111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int sum = a + b + c + d;
		int avg = sum / 4;
		System.out.printf("%s %d\n","sum",sum);
		System.out.printf("%s %d","avg",avg);
		
	}//end of main

}//end of class
