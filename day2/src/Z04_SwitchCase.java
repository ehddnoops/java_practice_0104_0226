/**
 *�ڹ��� �帧����
 *		���׿�����, if else, switch case
 *
 *
 *
 *
 */
public class Z04_SwitchCase {
	public static void main(String[] args) {
		
		System.out.println(123);
//		switch(���ǰ�) { ���ǰ��� int�� ���� �̳��� ���� or ���ڿ��� �ü� �ִ�
//		case ��1	: // �� ���ǰ��� ��1�� ������ ����
//			���๮
//			break; // switch~case ���� ����������
//		case ��2	:
//			���๮
//			break;
//		case ��3	:
//			���๮
//			break;
//		}
		switch(3) {
		case 1 :
			System.out.println("��");
			break;
		case 2 :
			System.out.println("��");
			break;
		case 3 :
			System.out.println("��");
			break;
		default : 
			System.out.println("�ش���׾���");
			break;
		}
		
		int day = 1;
		switch(day) {
		case 1 :
			System.out.println("��");
			break;
		case 2 :
			System.out.println("ȭ");
			break;
		case 3 :
			System.out.println("��");
			break;
		case 4 :
			System.out.println("��");
			break;
		case 5 :
			System.out.println("��");
			break;
		case 6 :
			System.out.println("��");
			break;
		case 7 :
			System.out.println("��");
			break;
		}
		
		
		
		switch('c') {
		case 'a' :
			System.out.println("��");
			break;
		case 'b' :
			System.out.println("ȭ");
			break;
		case 'c' :
			System.out.println("��");
			break;
		case 'd' :
			System.out.println("��");
			break;
		case 'e' :
			System.out.println("��");
			break;
		case 'f' :
			System.out.println("��");
			break;
		case 'g' :
			System.out.println("��");
			break;	
		}
		
		
		String word = "���";
		switch(word) {
		case "���" :
			System.out.println("apple");
			break;
		case "�ٳ���" :
			System.out.println("banana");
			break;
		default:
			System.out.println("�ܾ����");
			break;
		}
		
		int x = 9;
		int y = 2;
		int z = 3;
		int w = 5;
		
		int max = Integer.MIN_VALUE; // �ʱⰪ�� �߿���
		// ������� �߰ߵ� �ִ밪�� ������ ����
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
		System.out.println("�ִ밪 : " + max);
		
		
		
		
	}//end of main

}//end of class
