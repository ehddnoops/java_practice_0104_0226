import java.util.Scanner;

/**
 * 	static ���� : ���� Ŭ������ ���� ��� ��ü�� ������ ���� �����ϰ� ���� �� ���
 *	Card
 *
 *
 *
 */
public class Z18_Static {
	public static void main(String[] args) {
				Card c1 = new Card();
				c1.num = 1;
				c1.kind = "��Ʈ";
				Card.w = 10;
				Card.h = 20;
				Card c2 = new Card();
				c2.num = 7;
				c2.kind = "���̾Ƹ��";
				Card.w = 10;
				Card.h = 20;
				c1.printCard();
				c2.printCard();
				
				
				
	}//end of main
}//end of class


/** Ʈ���� ī�� ������ �߻�ȭ�� Ŭ����*/
class Card{	//Ŭ���� ����, �߻�ȭ �۾�
	/** ī���� ���� */
	int num;
	/** ī���� ���� */
	String kind;
	/** ��*/
	static int w =10;
	/** ����*/
	static int h= 20;
	
	
	/** ��������� ����ϴ� �޼���*/
	void printCard() {
		System.out.printf("[%s,%d]%d,%d\n",kind,num,w,h);
		
	}
}




