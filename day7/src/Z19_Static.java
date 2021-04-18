/**
 * static 변수 활용
 *
 *
 *
 */
public class Z19_Static {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "컴퓨터"; p1.price = 100; 
		p1.setSN();
		Product p2 = new Product();
		p2.name = "침대"; p2.price = 500;
		p2.setSN();
		
		Product p3 = new Product();
		p3.setSN();
		
		p1.printProduct();
		p2.printProduct();
		p3.printProduct();
		
	}//end of main

}//end of class

class Product{
	String name = "";// 문자열의 초기화는 빈 문자열로 하자
	int price;
	int sn;
	static int number = 1000; // 마지막으로 사용한 시리얼 번호를 저장할 변수
	void setSN() {//시리얼 넘버 생성 메서드
		sn = ++number;
	}
	
	void printProduct() {
		System.out.println(name + ", " + price + "," + sn) ;
	}//						null+", "+
}

