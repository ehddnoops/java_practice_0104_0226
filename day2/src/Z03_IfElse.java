/**
 * ���ǽ� : �帧�� ����
 * 			���׿�����, if~else, switch~case 
 * 
 * 		ctrl + d : Ŀ���� �� ����� 
 * 
 * 
 * 
 */
public class Z03_IfElse {
	public static void main(String[] args) {
		int a = 7; 
		System.out.println(a%2 == 0 ? "¦��":"Ȧ��");
		
		
		if(a == 7) {   //���ǽ��� ����� ��/�������� ���;���
			System.out.println("ĥ1");
			System.out.println("ĥ2");
			
		}
		else {
			System.out.println("���");
		}
		System.out.println("��");
		
		a = 3;
		
		if(a == 1) {
			System.out.println("1�̴�");
		} else if(a == 2){
			System.out.println("2�̴�");
		} else if(a == 3) {
			System.out.println("3�̴�");
		} else {
			System.out.println("�𸥴�");
		}
		
		
		a = 12;
		if (a == 9 || a == 10) {
			System.out.println("��");
		} else if (a == 8) {
			System.out.println("��");
		} else if (a == 7) {
			System.out.println("��");
		} else if (a == 6) {
			System.out.println("��");
		} else if (a <= 5) {
			System.out.println("��");
		} else {
			System.out.println("�ʰ��� �����Դϴ�");
		}
		
		
		
	}//end of main
}//end of class
