import java.util.Scanner;

/**
 * 		����	    �ܾ��
 * ��� : �빮��, 	_�� ����			��� �빮��
 * ���� : �ҹ���, �����ܾ��� ù���� �빮�� 
 *�޼���: �ҹ���, �����ܾ��� ù���� �빮�� 
 *Ŭ����: �빮��, �����ܾ��� ù���� �빮��
 *���ϸ�: �빮��, �����ܾ��� ù���� �빮��
 *������: �빮��, �����ܾ��� ù���� �빮��
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
		System.out.println("printCup �޼���");
		System.out.println(size);
	}
}

