/**
 * 조건식 : 흐름을 제어
 * 			삼항연산자, if~else, switch~case 
 * 
 * 		ctrl + d : 커서행 블럭 지우기 
 * 
 * 
 * 
 */
public class Z03_IfElse {
	public static void main(String[] args) {
		int a = 7; 
		System.out.println(a%2 == 0 ? "짝수":"홀수");
		
		
		if(a == 7) {   //조건식의 결과는 참/거짓으로 나와야함
			System.out.println("칠1");
			System.out.println("칠2");
			
		}
		else {
			System.out.println("노노");
		}
		System.out.println("끝");
		
		a = 3;
		
		if(a == 1) {
			System.out.println("1이다");
		} else if(a == 2){
			System.out.println("2이다");
		} else if(a == 3) {
			System.out.println("3이다");
		} else {
			System.out.println("모른다");
		}
		
		
		a = 12;
		if (a == 9 || a == 10) {
			System.out.println("수");
		} else if (a == 8) {
			System.out.println("우");
		} else if (a == 7) {
			System.out.println("미");
		} else if (a == 6) {
			System.out.println("양");
		} else if (a <= 5) {
			System.out.println("가");
		} else {
			System.out.println("초과된 점수입니다");
		}
		
		
		
	}//end of main
}//end of class
