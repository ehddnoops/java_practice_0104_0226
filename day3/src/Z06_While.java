/**
 * 자바의 반복문 : for, while, do~while
 * 
 * @author hongdaeui
 *
 */
public class Z06_While {
	public static void main(String[] args) {
//		while (조건식) { //트루 폴스로 논리값만 가능 참일 경우에만 실
//		} //실행문이 1개일 경우 생략가능
//
		
		int a= 3;
		while(a<6) {
			System.out.print(a);
			a++;	
		}
		System.out.println();
		
		for (int i = 3 ; i < 6 ; i++) {
			System.out.print(i);
		}
		System.out.println();
		
//		1 2 3 4 5
		a = 1;
		while (a<6) {
			System.out.print(a+ " ");
			a++;
		}
		System.out.println();
		
//		8 6 4 2
		a = 8;
		while (a > 0) {
			System.out.print(a+ " ");
			a -= 2;
		}
		System.out.println();
		
//		2 4 6 8
		a = 2;
		while(a<10) {
			System.out.print(a + " ");
			a += 2;
		}
		System.out.println();
		
//		-4 -1 2 5
		a = -4;
		while(a < 8) {
			System.out.print(a + " ");
			a += 3;
		}
		System.out.println();
		
//		4 1 -2 -5
		a = 4;
		while(a > -8) {
			System.out.print(a + " ");
			a -= 3;
			
		}
		
		a = 0;
		while(a < 10) {
			if(a % 2 != 0) {
				a++;
				continue;
				
			}
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main
}//end of class
