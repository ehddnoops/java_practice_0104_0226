import java.util.Scanner;

/**
 * scanner ��ȭ
 * @author ehddn
 *
 */
public class scane {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
//		sc.nextBoolean();
//		
//		"\n123\nhi\n456"
		int a = sc.nextInt();  //123
		System.out.println(a);
		String s = sc.nextLine(); // ""
		System.out.println(s);
		int b = sc.nextInt();  //
		System.out.println(b);
		
		// ��ĳ�� �⺻�� Ÿ�԰� nextLine�� ���� ���°��� ������������
		sc.close();
	}
}
