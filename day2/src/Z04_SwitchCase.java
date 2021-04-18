/**
 *자바의 흐름제어
 *		삼항연산자, if else, switch case
 *
 *
 *
 *
 */
public class Z04_SwitchCase {
	public static void main(String[] args) {
		
		System.out.println(123);
//		switch(조건값) { 조건값은 int형 범위 이내의 정수 or 문자열만 올수 있다
//		case 값1	: // 라벨 조건값과 값1이 같으면 실행
//			실행문
//			break; // switch~case 문을 빠져나간다
//		case 값2	:
//			실행문
//			break;
//		case 값3	:
//			실행문
//			break;
//		}
		switch(3) {
		case 1 :
			System.out.println("일");
			break;
		case 2 :
			System.out.println("이");
			break;
		case 3 :
			System.out.println("삼");
			break;
		default : 
			System.out.println("해당사항없음");
			break;
		}
		
		int day = 1;
		switch(day) {
		case 1 :
			System.out.println("월");
			break;
		case 2 :
			System.out.println("화");
			break;
		case 3 :
			System.out.println("수");
			break;
		case 4 :
			System.out.println("목");
			break;
		case 5 :
			System.out.println("금");
			break;
		case 6 :
			System.out.println("토");
			break;
		case 7 :
			System.out.println("일");
			break;
		}
		
		
		
		switch('c') {
		case 'a' :
			System.out.println("월");
			break;
		case 'b' :
			System.out.println("화");
			break;
		case 'c' :
			System.out.println("수");
			break;
		case 'd' :
			System.out.println("목");
			break;
		case 'e' :
			System.out.println("금");
			break;
		case 'f' :
			System.out.println("토");
			break;
		case 'g' :
			System.out.println("일");
			break;	
		}
		
		
		String word = "사과";
		switch(word) {
		case "사과" :
			System.out.println("apple");
			break;
		case "바나나" :
			System.out.println("banana");
			break;
		default:
			System.out.println("단어없음");
			break;
		}
		
		int x = 9;
		int y = 2;
		int z = 3;
		int w = 5;
		
		int max = Integer.MIN_VALUE; // 초기값이 중요함
		// 현재까지 발견된 최대값을 저장할 변수
		if (max < x) {
			max = x;
		}
		if (max < y) {
			max = y;
		}
		if (max < z) {
			max = z;
		}
		if (max < w) {
			max = w;
		}
		System.out.println("최대값 : " + max);
		
		
		
		
	}//end of main

}//end of class
