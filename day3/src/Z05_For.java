/**
 * �ڹ��� �ݺ���
 * for, while, do~while
 * 
 * 
 * 
 */
public class Z05_For {
	public static void main(String[] args) {
//		for(�ʱ��		; ���ǽ� ;������) {
//		for(int i = 0; i < 3; i++) {
//			���๮;
//			���๮;
//		}
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		
		
		for (int i = 0;i < 5; i++) {
			System.out.println(i);
		}
		
		for (int i = 2; i < 7; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("=======");
		
		for (int i = 6; i > 1; i--) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("========");
		//2 4 6 8 10
		for (int i = 2; i < 11; i = i+2) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("========");
		// 1 3 5 7 9
		for (int i = 1; i < 11; i += 2) {
			System.out.print(i +"  ");
		}
		
		System.out.println();
		System.out.println("========");
		
		
		//2 5 8 11 14
		for (int i = 2; i < 15; i += 3) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("========");
		
		
		//5 3 1 -1 -3
		for (int i = 5; i >-4; i -= 2) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("========");
		
		//-4 -1 2 5 8
		for (int i = -4; i < 9; i += 3) {
			System.out.print(i + "  ");
		}
		
		// ���ǽ��� �Ⱦ��� true�� ���� - > ���ѷ���
		

		System.out.println();
		System.out.println("========");
//		1~10��� 
		int i;
		
		for (i = 1; i < 10.5; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("========");
	
		for (i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		
		
		for(i = 0; i < 3; i++) {
			for(int t= 0; t <4; t++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("========");
		
		
		
		for (i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		System.out.println(""); ���ξ��� ������ ����� �ٹٲ�
//		System.out.print(""); ������ ������ ��� 
//		System.out.printf(); ������ ������ ���信 ���� ��� 
		
		//printf() �˾ƺ���
		
System.out.println();
		
		String name = "����";
		System.out.printf("�ȳ�%s��\n", name);
		System.out.printf("�ȳ�" + name + "��\n");
		System.out.printf("���� :%s, %s, %s\n", "���", "��", "�ٳ���");
		System.out.printf("[%s]\n", "hi");
		System.out.printf("[%4s]\n", "hi");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main

}//end of class