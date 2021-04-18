import java.util.Scanner;

/**
 * 		시작	    단어구분
 * 상수 : 대문자, 	_로 구분			모두 대문자
 * 변수 : 소문자, 다음단어의 첫글자 대문자 
 *메서드: 소문자, 다음단어의 첫글자 대문자 
 *클래스: 대문자, 다음단어의 첫글자 대문자
 *파일명: 대문자, 다음단어의 첫글자 대문자
 *생성자: 대문자, 다음단어의 첫글자 대문자
 *
 *
 *
 */
public class Z15_Class3 {
	public static void main(String[] args) {
		int max = 4;
		Scanner sc;
		
		
		Cup c = new Cup();
		c.size = 7;
		Cup c2 = new Cup();
		c2.size = 55;
		
	}//end of main

}//end of class

class Cup {
	int size;
	void printCup() {
		int computer = 3;
		System.out.println("printCup 메서드");
		System.out.println(size);
	}
}

