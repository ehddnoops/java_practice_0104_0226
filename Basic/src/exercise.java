/**
 * 6�� ����
 */
public class exercise {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.age = 123;
		s1.sung = "��";
		s1.name = "����";
		
		Car c1 = new Car();
		c1.color = "�Ķ�";
		c1.speed = 123;
		
		s1.transfer();
		c1.go();
		
	}//end of main
}//end of class

class Student {
	int age;
	String sung;
	String name;
	
	void transfer() {
		System.out.printf("age = %d sung = %s name = %s\n",age,sung,name);
	}
}

class Car {
	String color;
	int speed;
	void go() {
		System.out.printf("mycar = %s, mycar speed = %d\n",color,speed);
	}
}