import java.util.Scanner;

/**
 *
 *
 *
 */
public class b515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		int d = a / b;
		System.out.printf("%d%s%d%s%d\n",a," * ",b," = ",c);
		System.out.printf("%d%s%d%s%d",a," / ",b," = ",d);
	}

}
