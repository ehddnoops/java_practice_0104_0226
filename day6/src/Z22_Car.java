/**
 * ��� Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �����ؾ��Ѵ� 
 * Ŭ������ �����ڰ� �ϳ��� ���°�� �����Ϸ��� �⺻ �����ڸ� �߰����ش�
 * �����ڸ� �ϳ��� �߰��ϸ� �����Ϸ��� �⺻�����ڸ� �߰��������ʴ´�
 * ������ �۾��� �Ұ�� �⺻�����ڵ� ���� �߰������� @@@@@@@@@@@@@@@@@@@@@@@@@
 * 
 * 
 * ���� : ��������, ��ǰ����, �������� / ������, ��������, ��������, ������ / ī���� ����
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
		
		Car c1 = new Car("����",100,2,true,"����");
		
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
//		name = "Ƽ��";
//		door = 1;
//		color = "����";
//		�ٸ� �����ڸ� ȣ���ϱ�, ������ ù��° �ٿ��� ��밡��
		this("Ƽ��",0,1,false,"����");
		
	}
	Car(String name,int speed, int door, boolean start, String color){
		this.name = name;
		this.speed = speed;
		this.door = door;
		this.start = start;
		this.color = color;
		
	}
	void printCar() {
		
		System.out.printf("%s �ӵ� :%dkm/H ��:%s\n%s %s\n",name,speed,door,start ? "�õ�����" : "�õ�����",color);
	}
	void plusSpeed() {
		speed += 10;
		System.out.printf("�ӵ� %d \n %s\n",speed, start ? "�õ�����" : "�õ�����");
	}
	void minusSpeed() {
		speed -= 10;
	}
}


