import java.util.Scanner;

/**
 * 
 * 113
 */
public class c113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int length = sc.nextInt();
		width += 5;
		length = length * 2;
		int area = width * length;
		System.out.printf("%s = %d\n","width",width);
		System.out.printf("%s = %d\n","length",length);
		System.out.printf("%s = %d\n","area",area);
		
	}

}
