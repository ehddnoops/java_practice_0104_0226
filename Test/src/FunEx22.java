import java.util.Scanner;

public class FunEx22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextInt();
		System.out.println(sum(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(avg(a,b,c));
		
		
	}//end of main
	static int sum(int a, int b) {
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static double avg(double a,double b, double c) {
		if(c == 0 ) {
			System.out.println("0으로 못나눔");
			System.exit(0);
		}
		return (a+b)/c;
	}
	
}//end of class
