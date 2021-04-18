
public class FunEx2 {
	public static void main(String[] args) {
		Car();
	System.out.println("---------");
		Car2("차차이차");
	System.out.println("---------");
		int speed = Car3();
		System.out.println(speed);
	System.out.println("---------");
		String pre = Car4("차이름");
		System.out.println(pre);
		
		
		
		System.out.println("---------");
	
	}//end of main
	
	
	static void Car() {
		System.out.println("차차차");
	}
	
	static void Car2(String co) {
		System.out.println(co);
	}
	static int Car3() {
		return 414;
	}
	static String Car4(String co) {
		System.out.println("차차차");
		System.out.println(co + "차를선물");
		return "선물받음";
		
	}
	

}//end of class
