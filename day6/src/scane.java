import java.util.Scanner;

/**
 * scanner 심화
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
		
		// 스캐너 기본형 타입과 nextLine을 섞어 쓰는것을 권장하지않음
		sc.close();
	}
}
