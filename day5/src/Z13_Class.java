/**
 * 클래스 : 사용자 정의 타입
 *  (전역)변수, 메서드, 
 *
 *
 *
 */
public class Z13_Class {
	public static void main(String[] args) {
		int a;//변수 선언, 기본형
		a = 3;//변수 초기화
		int b = 3;//변수 선언,초기화
		
		Cup c;//변수 선언, 참조형
		c = new Cup();
		c.size = 3;
		c.color = "흰색";
		
		
		Cup c2 = new Cup();// 변수선언, 객체생성 한번에
		c2.size = 4;
		c2.color = "빨강";
		
		c.printCup();
		c2.printCup();
		
		
		
	}//end of main

}//end of class 

class Cup{ // 클래스를 정의
	int size;
	String color;
/**
 * 내 클래스의 변수를 출력하는 매서드
 * @return
 */
	void printCup() {
		System.out.println(size + ", " +color);
	}
}

// 절차지향언어
// 객체지향언어 : class
// 제어자 modifier























