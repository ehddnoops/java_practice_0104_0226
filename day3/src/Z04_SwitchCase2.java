import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/**
 * switch~case if~else ���׿�����
 * 
 *  if���� switch���� �ٲ㾵�� �ִ�
 *  		��, switch case���� ���� ���� ��츸 ���� �� ����
 * 
 * 
 *
 */
public class Z04_SwitchCase2 {
	public static void main(String[] args) {
		
		int a;
		a = 5;
		switch (a) {
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;

		default:
			System.out.println("����");
			break;
		}
		
		
		
		
		
		if(a == 1) {
			System.out.println("�ϳ�");
		}
		else if(a == 2) {
			System.out.println("��");
		}
		else if (a == 3) {
			System.out.println("��");
		}
		else {
			System.out.println("����");
		}
		
//		10~0���� �Էµ� �� : 10~9 ��: 8 �� : 7 ��:������ 
		
		int b = 10;
		switch (b) {
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
		
		
//		��:100~90 ��:89~80 ��:79~70 ��: ������
		int c = 87;
		switch (c/10) {
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		default:
			System.out.println("������");
			break;
		}
		
		
		int month = 4; // 31��
		switch (month) {
		case 2:
			System.out.println(28);
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(30);
			
			break;
		default:
			System.out.println(31);
			break;
		}

	}//end of main
}//end of class
