import java.util.Scanner;

/**
 *
 * ����� �Է¹ޱ� : scanner
 *
 */
public class Z09_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է¹ޱ� ���� ��ü ����
		//import 
//		System.out.println(123);
		System.out.println("���� 3���� �Է����ּ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// �ִ밪 ���, �ּҰ� ���
//		 int max = Integer.MIN_VALUE;
//		 
//		 if(max < a) {
//			 max = a;
//		 }
//		 if(max < b) {
//			 max = b;
//		 }
//		 if(max < c) {
//			 max = c;
//		 }
//		 System.out.println("�ִ밪��" + max);

		 int min = Integer.MAX_VALUE;
		 
		 if(min > a) {
			 min = a;
		 }
		 if(min > b) {
			 min = b;
		 }
		 if(min > c) {
			 min = c;
		 }
		 System.out.println("�ּҰ���" + min);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}//end of main

}//end of class
