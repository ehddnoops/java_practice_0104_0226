/**
 * 생성자 : Constructor
 * 		초기화 메서드 역할
 *		//기본생성자 : 클래스명과 동일 , 리턴타입 x
 */
public class Z21_Constructor {
	public static void main(String[] args) {
		Mart m1 = new Mart("홈플러스",10000,1000);
		Mart m2 = new Mart();
		m2.name = "3마트"; m2.ball = 10000; m2.pen = 1000;
		
		
		
	}//end of main

}//end of class
















class Mart {
	String name = "";
	int ball;
	int pen;
	
	Mart(){		//기본생성자 : 매개변수가 하나도 없는 생성자
		
	}
	
	// 생성자의 오버로딩 @@@@@@
	
	
	
	//참조의 기본 원칙 : 참조의 위치에서 가까운 곳에 선언된 것을 먼저 참조한다.
	Mart(String name, int ball, int pen){// 생성자
		this.name = name;
		this.ball = ball;
		this.pen = pen;
		
	}
//this : 나자신의 객체를 가리키는 참조 변수
//		컴파일러가 메서드와 생성자에 지역변수로 제공해준다
	
	
	void printmart() {
		System.out.printf("%s의 가격정보 \n공:%d, 펜:%d\n",name, ball, pen);
		
		
		
	}
}