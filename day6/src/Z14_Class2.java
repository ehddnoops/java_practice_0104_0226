/**
 * 
 * 변수, 배열, 스트럭쳐, 클래스 
 * 클래스 : 
 * 변수,메서드
 * 
 */
public class Z14_Class2 {
	public static void main(String[] args) {
		Mart m1 = new Mart();
		m1.name = "홈플러스";
		m1.candy = 500;
		m1.pen = 1000;
		m1.ball = 10000;
		
		Mart m2 = new Mart();
		m2.name = "이마트";
		m2.candy = 600;
		m2.pen = 1500;
		m2.ball = 12000;
		
		m1.printMart();
		m2.printMart();
		m1.sale();
		m2.sale();
	}

}
class Mart {
	String name; // 마트의 이름
	int candy; // 캔디의 가격
	int pen; // 펜의 가격
	int ball; // 공의 가격
	/**
	 * 마트의 가격정보를 출력하는 메서드
	 */
	void printMart() {
		System.out.println(name + "마트의 가격 정보");
		System.out.printf("캔디:%d원, 펜:%d원, 공:%d원\n",candy,pen,ball);
	}
	/**
	 * 할인하는 메서드
	 */
	void sale() {
		candy *= 0.8;
		pen *= 0.8;
		ball *= 0.8;
		System.out.println("할인후");
		printMart();
	}
}
