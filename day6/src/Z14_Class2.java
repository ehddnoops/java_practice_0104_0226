/**
 * 
 * ����, �迭, ��Ʈ����, Ŭ���� 
 * Ŭ���� : 
 * ����,�޼���
 * 
 */
public class Z14_Class2 {
	public static void main(String[] args) {
		Mart m1 = new Mart();
		m1.name = "Ȩ�÷���";
		m1.candy = 500;
		m1.pen = 1000;
		m1.ball = 10000;
		
		Mart m2 = new Mart();
		m2.name = "�̸�Ʈ";
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
	String name; // ��Ʈ�� �̸�
	int candy; // ĵ���� ����
	int pen; // ���� ����
	int ball; // ���� ����
	/**
	 * ��Ʈ�� ���������� ����ϴ� �޼���
	 */
	void printMart() {
		System.out.println(name + "��Ʈ�� ���� ����");
		System.out.printf("ĵ��:%d��, ��:%d��, ��:%d��\n",candy,pen,ball);
	}
	/**
	 * �����ϴ� �޼���
	 */
	void sale() {
		candy *= 0.8;
		pen *= 0.8;
		ball *= 0.8;
		System.out.println("������");
		printMart();
	}
}
