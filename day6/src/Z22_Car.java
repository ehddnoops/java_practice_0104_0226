/**
 * 모든 클래스에는 반드시 하나 이상의 생성자가 존재해야한다 
 * 클래스에 생성자가 하나도 없는경우 컴파일러가 기본 생성자를 추가해준다
 * 생성자를 하나라도 추가하면 컴파일러는 기본생성자를 추가해주지않는다
 * 생성자 작업을 할경우 기본생성자도 같이 추가해주자 @@@@@@@@@@@@@@@@@@@@@@@@@
 * 
 * 
 * 정렬 : 선택정렬, 거품정렬, 삽입정렬 / 힙정렬, 병합정렬, 머지정렬, 쉘정렬 / 카운팅 정렬
 * int[] a = {3,1,6,8,4,5};
 * 
 * 
 * 
 * 
 * @author ehddn
 *
 */
public class Z22_Car {
	public static void main(String[] args) {
		
		Car c1 = new Car("람보",100,2,true,"빨강");
		
		c1.printCar();
		c1.plusSpeed();
		c1.minusSpeed();
		System.out.println("============");
		Car c2 = new Car();
		c2.printCar();
		
		
		
		
		
		
		
		
	}//end of main

}//end of class

class Car {
	String name = "";
	int speed;
	int door;
	boolean start;
	String color = "";
	
	Car() {
//		name = "티코";
//		door = 1;
//		color = "검정";
//		다른 생성자를 호출하기, 생성자 첫번째 줄에만 사용가능
		this("티코",0,1,false,"검정");
		
	}
	Car(String name,int speed, int door, boolean start, String color){
		this.name = name;
		this.speed = speed;
		this.door = door;
		this.start = start;
		this.color = color;
		
	}
	void printCar() {
		
		System.out.printf("%s 속도 :%dkm/H 문:%s\n%s %s\n",name,speed,door,start ? "시동켜짐" : "시동꺼짐",color);
	}
	void plusSpeed() {
		speed += 10;
		System.out.printf("속도 %d \n %s\n",speed, start ? "시동켜짐" : "시동꺼짐");
	}
	void minusSpeed() {
		speed -= 10;
	}
}


