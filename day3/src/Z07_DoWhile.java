/**
 * 
 * for : 반복할 회수, 범위를 미리 알고있을 경우
 * while : 반복할 회수, 범위를 미리 모르고 있을 경우
 * do~while : 반드시 1회 실행은 해야될 떄
 * 
 * 
 * 
 * @author hongdaeui
 *
 */
public class Z07_DoWhile {
	public static void main(String[] args) {
		
		int a = 3;
		do {
			System.out.println(a);
			
		} while(false);
		
		
		
//		do{} 안에서 선언한 변수는 조건식에서 사용할 수 없다.
//		do {
//		int b = 3;
//			System.out.println(b);
//		} while (b<7);
		
		
//		1 3 5 7
		a = 1;
		do {
			System.out.print(a + " ");
			a += 2;
		} while (a<8); // while 조건문 뒤에 세미콜론(;)을 꼭 써야한다!
		System.out.println();
		
//		2 4 6 8
		a = 2;
		do {
			System.out.print(a + " ");
			a += 2; 
		} while (a < 9);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main
}//end of class
