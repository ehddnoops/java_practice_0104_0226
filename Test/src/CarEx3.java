
public class CarEx3 {
	
	public static void main(String[] args) {
		
		Car3 myCar1 = new Car3();
		
		System.out.println(myCar1.company);
		
		System.out.println("-------------");
		
		Car3 myCar2 = new Car3("�ڰ���");
		System.out.println(myCar2.company);
		System.out.println(myCar2.model);
		
		System.out.println("-------------");
		
		Car3 myCar3 = new Car3("�ڰ���", "����");
		System.out.println(myCar3.company);
		System.out.println(myCar3.model);
		System.out.println(myCar3.color);
		
		System.out.println("-------------");
		
		Car3 myCar4 = new Car3("�ý�", "����", 200);
		System.out.println(myCar4.company);
		System.out.println(myCar4.model);
		System.out.println(myCar4.color);
		System.out.println(myCar4.maxSpeed);
	}

}
