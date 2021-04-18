/**
 * 
 *python c - 함수: 명령문의 묶음, 클래스 외부에 위치
 *python java - 메서드:  명령문의 묶음, 클래스 내부에 위치
 *
 *
 * 
 *
 *
 *
 *
 *
 *
 */
public class Z12_Method {
	public static void main(String[] args) {
		System.out.println("메인 메서드가 시작되었습니다.");
		int x = sum(1,2);
		System.out.println("메서드에서 구해온값"+ x);
		System.out.println(sum(1,2));
		System.out.println("차 : "+ sub(7,5));
		System.out.println("곱 : "+ mul(7,5));
		System.out.println("몫 : "+ div(7,0));
		System.out.println("나머지 : "+ mod(7,5));
		
		gogosing();
		gogosing();
		gogosing();
		
		System.out.println("절대값 : " +abs(-3)); // 0또는 양수로 변환
		System.out.println("최대값 : " +max(5,2)); // 최대값 리턴
		
		
		System.out.println("메인 메서드가 종료.");
		
		
//		Math 수학관련 메서드를 묶어놓은 클래스
		System.out.println(Math.abs(-8));
		System.out.println(Math.max(2,7));
		
		
		
	}//end of main
/**
 * 
 * @param a값
 * @param b값
 * @return a와 b값중 큰값 출력
 */
	
public static int max(int a, int b) {
	return a >= b ? a : b;
}


public static int abs(int a) {
	return a >= 0 ? a : -a;
	}
	
//	if(a >= 0) {
//		retrun a;
//	}
//	else {
//		retrun -a;
//	}
//}


// 리턴할 값이 없는 경우는 리턴타입을 void로 명시해야한다.
	public static void gogosing() { // 매개변수 갯수에 제한이 없다 .
		System.out.println("고고싱");
		return ; // 생략 가능
	}
/**
 * 두수의 차를 구해서 리턴하는 메서드
 * @param i 첫번째 숫자
 * @param j 두번째 숫자
 * @return 보내온 두개의 매개변수의 나머지
 */
	public static int mod(int i, int j) {
		// TODO Auto-generated method stub
		return i%j;
	}

	public static int div(int i, int j) {
		int result;
		if(j == 0) {
			System.out.println("나눌수없습니다");
			result = 0;
		}else {
			result = i/j;
		}
		return result;
	
	}
	public static int mul(int i, int j) {
		// TODO Auto-generated method stub
		
		return i*j;
	}
	public static int sub(int a, int b) {
		// TODO Auto-generated method stub
		int c = a - b;
		return c;
	}
	//매개변수 : 개수의 제한이 없다
	//매서드명 : 식별자 명명규칙을 따른다, 메서드의 첫글자는 소문자로 하자.
	//리턴타입 : 메서드의 실행결과로 되돌려줄 값의 타입
	
	public static int sum(int a, int b) { // 메서드 정의
		System.out.println("두수의 합을 구해서 리턴하는 메서드입니다.");
		int c = a + b;
		return c;
	}
	
	
	
	
	
	//		리턴타입 메서드명 매개변수
//	public int abc    (int a, String b, boolean[] c) {
//		System.out.println();
//		return 3; 
//	}
	
	

}//end of class












