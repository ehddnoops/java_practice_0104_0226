import java.util.Scanner;

/**
 * 	static 변수 : 같은 클래스로 만든 모든 객체에 동일한 값을 적용하고 싶을 때 사용
 *	Card
 *
 *
 *
 */
public class Z18_Static {
	public static void main(String[] args) {
				Card c1 = new Card();
				c1.num = 1;
				c1.kind = "하트";
				Card.w = 10;
				Card.h = 20;
				Card c2 = new Card();
				c2.num = 7;
				c2.kind = "다이아몬드";
				Card.w = 10;
				Card.h = 20;
				c1.printCard();
				c2.printCard();
				
				
				
	}//end of main
}//end of class


/** 트럼프 카드 한장을 추상화한 클래스*/
class Card{	//클래스 정의, 추상화 작업
	/** 카드의 숫자 */
	int num;
	/** 카드의 무늬 */
	String kind;
	/** 폭*/
	static int w =10;
	/** 높이*/
	static int h= 20;
	
	
	/** 멤버변수를 출력하는 메서드*/
	void printCard() {
		System.out.printf("[%s,%d]%d,%d\n",kind,num,w,h);
		
	}
}




