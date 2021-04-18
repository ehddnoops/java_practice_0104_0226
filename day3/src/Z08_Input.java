import java.util.Scanner;

/**
 * 사용자의 입력 받기 : Scanner
 * @author hongdaeui
 *
 */
public class Z08_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사용자의 입력받기 위한 객체를 생성
		//import 해야한다. 라이브러 임포트 해야한다.!
		
//		System.out.println("나이를 입력하세요 : ");
//		int age= sc.nextInt(); //사용자가 키보드로 입력한 값을 정수로 받아온다!
//		//사용자가 키보드로 입력후 엔터 칠때까지 기다림
//		System.out.println("당신의 나이는" + age + "살 입니다.");
//		
//		System.out.println("나이를 또 입력하세요");
//		int adf = sc.nextInt();
//		System.out.println("입력나이" + adf + "살");
//		
//		System.out.println("1~12 사이의 달을 입력하세요");
//		int month = sc.nextInt();
//		
//		switch (month) {
//		case 4: case 6: case 9: case 11: 
//			System.out.println("30일 까지 있습니다.");	
//			break;
//		case 2:
//			System.out.println("28일 까지 있습니다.");
//			break;
//		default :
//			System.out.println("31일 까지 있습니다.");
//			break;
//		}
		
		System.out.println("몇단을 출력 할까요?");
		//사용자의 입력을 정수로 받아서 구구단을 출력
		int num = sc.nextInt();
		
		for (int i = 2; i < 10; i++) {
				System.out.printf("%d * %d = %2d\n ", num, i, num*i);
				
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}//end of main
}//end of class
