import java.util.Scanner;

public class e533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int age = sc.nextInt();
		if(a.equals("M") && age >= 18) {
			System.out.println("MAN");
		} else if (a.equals("M")) {
			System.out.println("BOY");
		} else if (a.equals("F") && age >= 18 ) {
			System.out.println("WOMAN");
		} else {
			System.out.println("GIRL");
		}
		
	}

}
