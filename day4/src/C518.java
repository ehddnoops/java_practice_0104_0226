import java.util.Scanner;

/**
 *
 * ���ÿ� java ���� ����� Ŭ���� ���� Main �̾�� ��
 *
 */
public class C518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		System.out.println("sum"+" "+":"+" "+sum);
		
		int avg = sum / 3;
		System.out.println("avg"+" "+":"+" "+avg);	
	}//end of class
}//end of main
