
public class FunEx2 {
	public static void main(String[] args) {
		Car();
	System.out.println("---------");
		Car2("��������");
	System.out.println("---------");
		int speed = Car3();
		System.out.println(speed);
	System.out.println("---------");
		String pre = Car4("���̸�");
		System.out.println(pre);
		
		
		
		System.out.println("---------");
	
	}//end of main
	
	
	static void Car() {
		System.out.println("������");
	}
	
	static void Car2(String co) {
		System.out.println(co);
	}
	static int Car3() {
		return 414;
	}
	static String Car4(String co) {
		System.out.println("������");
		System.out.println(co + "��������");
		return "��������";
		
	}
	

}//end of class
