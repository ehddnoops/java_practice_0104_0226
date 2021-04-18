import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/**
 * switch~case if~else 삼항연산자
 * 
 *  if문과 switch문은 바꿔쓸수 있다
 *  		단, switch case문은 값이 같은 경우만 비교할 수 있음
 * 
 * 
 *
 */
public class Z04_SwitchCase2 {
	public static void main(String[] args) {
		
		int a;
		a = 5;
		switch (a) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;

		default:
			System.out.println("없음");
			break;
		}
		
		
		
		
		
		if(a == 1) {
			System.out.println("하나");
		}
		else if(a == 2) {
			System.out.println("둘");
		}
		else if (a == 3) {
			System.out.println("셋");
		}
		else {
			System.out.println("없음");
		}
		
//		10~0값만 입력됨 수 : 10~9 우: 8 미 : 7 가:나머지 
		
		int b = 10;
		switch (b) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("가");
			break;
		}
		
		
//		수:100~90 우:89~80 미:79~70 가: 나머지
		int c = 87;
		switch (c/10) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("나머지");
			break;
		}
		
		
		int month = 4; // 31일
		switch (month) {
		case 2:
			System.out.println(28);
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(30);
			
			break;
		default:
			System.out.println(31);
			break;
		}

	}//end of main
}//end of class
