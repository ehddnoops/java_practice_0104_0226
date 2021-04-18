import java.util.Scanner;

/**
 *
 * 정올에 java 문제 제출시 클래스 명이 Main 이어야 함
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
