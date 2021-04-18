/**
 *변수 -지역변수, 전역변수(인스턴스변수, static 변수)
 *지역변수 : 메서드 안쪽에서 선언한 변수, local variable
 *		  생성시점-선언문 실행시
 *		  생성위치-Callstack
 *		  소멸시점-선언문이 포함된 블럭을 빠져나가면 "즉시"삭제
 *인스턴스 변수: 클래스 안쪽 메서드 바깥쪽에서 선언한 변수 (fields), non-static
 *			 생성시점-객체생성시 (new)
 *			 생성위치-Heap
 *			 소멸시점-참조변수가 없어지면 GC가 삭제해준다 .(가비지컬렉터)
 *static 변수:클래스 안쪽 메서드 바깥쪽에서 선언한 변수 (fields), 클래스변수
 *			 생성시점-클래스가 처음 로딩될때
 *			 생성위치-class area, method area
 *			 소멸시점-프로그램 종료시까지, 안없어짐
 *
 */
public class Z16_Variable {
	public static void main(String[] args) {
//		sum = 3; 
		int sum = 0;// 지역변수 
		System.out.println(sum);// 초기화를 해야 사용할수 있다.
		sum = 3;
		
		
	}//end of main

}//end of class


class Var{ //클래스 
	int size; // 인스턴스 변수
	static int tall; // static 변수
	void print() { // 메서드
		int a;
	}
}
