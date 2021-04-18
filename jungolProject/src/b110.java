import java.util.Scanner;

/**
 * 
 * 110¹ø ¹®Á¦
 */
public class b110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double yard = sc.nextDouble();
		double b = yard * 91.44;
		
		System.out.printf("%.1f%s%.1f%s",yard,"yard = ",b,"cm");
	}

}
