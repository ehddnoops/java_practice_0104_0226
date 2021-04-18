import java.util.Scanner;

/**
 *
 *자료구조 : 많은 양의 데이터를 효율적으로 저장하기 위한 방법
 *
 *array 배열 : 같은 타입 변수들의 묶음
 *
 */
public class Z10_Array {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 5;
		
		// 기본형 타입: 변수에 값을 직접 저장
		// 참조형 타입: 실제 데이터가 있는 위치의 주소를 저장
		// 참조형 타입변수 : 기본형 타입이 아닌변수
		
		
//		배열 선언
		int[] arr = new int[3]; // 배열 선언
		int[] brr; // 배열 변수 선언
		brr = new int[3]; // 객체생성 (메모리에 공간을 확보)
		// 객체 생성시 각타입의 초기값(0)으로 초기화 된다.
//		정수형:0 실수형: 0.0 문자형: '/u0000', 논리형: false, 참조형: null 
		
		
//		crr 배열 선언, 생성, 값을 7,8,9
		
		int[] crr = new int[3];
		crr = new int[3];
		crr[0] = 7;
		crr[1] = 8;
		crr[2] = 9;
		
		System.out.println(crr[1]);
		
		int[] drr = {4,5,6};
		System.out.println(drr[1]);
		
		int[] x = {3,1,2,5};
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+"");
		}
		System.out.println("========");
//		x.length : 배열의 크기
		
//		System.out.println(x[-1]); //ArrayIndexOutOfBoundsException
		
		// 사용자의 입력을 3개 받아서 합을 출력하기 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 세개를 입력하세요");
		
//		int[] y = new int[3];
//		
//		for (int i = 0; i < y.length; i++) {
//			y[i] = sc.nextInt();
//		}
//		int sum = 0;
//		for (int i = 0; i < y.length; i++) {
//			sum = sum + y[i];
//		}
//		System.out.println("총합: "+ sum);
//		
//		
//		
//		
//		
//		int[] z = {3,1,4,8,6,5,2,9,7,0};
//		int key = 2;
//
//		//		z 배열에 key 값이 있느냐 ?없느냐 ?
//		
//		boolean flag = false;
//		for (int i = 0; i < z.length; i++) {
//			if (z[i] == key) {
//				System.out.println("있다");
//				flag = true;
//				break;
//			}
//		}
//			if(flag == false) {
//				System.out.println("없다");
//			}
//			
//			
			
			
			
			int[] t = {1,2,3,0,2,2,2,3,1,1};
			int key = 2;
			int z = 0;
//			t배열에 key 값이 몇번 나왔느냐. 횟수출력
			for (int i = 0; i < t.length; i++) {
				if(t[i] == key) {
				z++;
			}
		}
		System.out.println(z);
		
		
		
		
		

		
		
		
		
		
		
		
		
	// index :방번호, 0,1,2
		brr[0] = 3;
		brr[1] = 4;
		brr[2] = 5;	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main
}//end of class
