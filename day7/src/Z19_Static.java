/**
 * static ���� Ȱ��
 *
 *
 *
 */
public class Z19_Static {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "��ǻ��"; p1.price = 100; 
		p1.setSN();
		Product p2 = new Product();
		p2.name = "ħ��"; p2.price = 500;
		p2.setSN();
		
		Product p3 = new Product();
		p3.setSN();
		
		p1.printProduct();
		p2.printProduct();
		p3.printProduct();
		
	}//end of main

}//end of class

class Product{
	String name = "";// ���ڿ��� �ʱ�ȭ�� �� ���ڿ��� ����
	int price;
	int sn;
	static int number = 1000; // ���������� ����� �ø��� ��ȣ�� ������ ����
	void setSN() {//�ø��� �ѹ� ���� �޼���
		sn = ++number;
	}
	
	void printProduct() {
		System.out.println(name + ", " + price + "," + sn) ;
	}//						null+", "+
}

