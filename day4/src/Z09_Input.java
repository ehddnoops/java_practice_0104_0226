import java.util.Scanner;

/**
 *
 * 사용자 입력받기 : scanner
 *
 */
public class Z09_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력받기 위한 객체 생성
		//import 
//		System.out.println(123);
		System.out.println("숫자 3개를 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 최대값 출력, 최소값 출력
//		 int max = Integer.MIN_VALUE;
//		 
//		 if(max < a) {
//			 max = a;
//		 }
//		 if(max < b) {
//			 max = b;
//		 }
//		 if(max < c) {
//			 max = c;
//		 }
//		 System.out.println("최대값은" + max);

		 int min = Integer.MAX_VALUE;
		 
		 if(min > a) {
			 min = a;
		 }
		 if(min > b) {
			 min = b;
		 }
		 if(min > c) {
			 min = c;
		 }
		 System.out.println("최소값은" + min);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}//end of main

}//end of class
