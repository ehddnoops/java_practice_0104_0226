import java.util.Scanner;

/**
 *
 *�ڷᱸ�� : ���� ���� �����͸� ȿ�������� �����ϱ� ���� ���
 *
 *array �迭 : ���� Ÿ�� �������� ����
 *
 */
public class Z10_Array {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 5;
		
		// �⺻�� Ÿ��: ������ ���� ���� ����
		// ������ Ÿ��: ���� �����Ͱ� �ִ� ��ġ�� �ּҸ� ����
		// ������ Ÿ�Ժ��� : �⺻�� Ÿ���� �ƴѺ���
		
		
//		�迭 ����
		int[] arr = new int[3]; // �迭 ����
		int[] brr; // �迭 ���� ����
		brr = new int[3]; // ��ü���� (�޸𸮿� ������ Ȯ��)
		// ��ü ������ ��Ÿ���� �ʱⰪ(0)���� �ʱ�ȭ �ȴ�.
//		������:0 �Ǽ���: 0.0 ������: '/u0000', ����: false, ������: null 
		
		
//		crr �迭 ����, ����, ���� 7,8,9
		
		int[] crr = new int[3];
		crr = new int[3];
		crr[0] = 7;
		crr[1] = 8;
		crr[2] = 9;
		
		System.out.println(crr[1]);
		
		int[] drr = {4,5,6};
		System.out.println(drr[1]);
		
		int[] x = {3,1,2,5};
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+"");
		}
		System.out.println("========");
//		x.length : �迭�� ũ��
		
//		System.out.println(x[-1]); //ArrayIndexOutOfBoundsException
		
		// ������� �Է��� 3�� �޾Ƽ� ���� ����ϱ� 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		
//		int[] y = new int[3];
//		
//		for (int i = 0; i < y.length; i++) {
//			y[i] = sc.nextInt();
//		}
//		int sum = 0;
//		for (int i = 0; i < y.length; i++) {
//			sum = sum + y[i];
//		}
//		System.out.println("����: "+ sum);
//		
//		
//		
//		
//		
//		int[] z = {3,1,4,8,6,5,2,9,7,0};
//		int key = 2;
//
//		//		z �迭�� key ���� �ִ��� ?������ ?
//		
//		boolean flag = false;
//		for (int i = 0; i < z.length; i++) {
//			if (z[i] == key) {
//				System.out.println("�ִ�");
//				flag = true;
//				break;
//			}
//		}
//			if(flag == false) {
//				System.out.println("����");
//			}
//			
//			
			
			
			
			int[] t = {1,2,3,0,2,2,2,3,1,1};
			int key = 2;
			int z = 0;
//			t�迭�� key ���� ��� ���Դ���. Ƚ�����
			for (int i = 0; i < t.length; i++) {
				if(t[i] == key) {
				z++;
			}
		}
		System.out.println(z);
		
		
		
		
		

		
		
		
		
		
		
		
		
	// index :���ȣ, 0,1,2
		brr[0] = 3;
		brr[1] = 4;
		brr[2] = 5;	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main
}//end of class
