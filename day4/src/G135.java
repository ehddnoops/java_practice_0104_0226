import java.util.Scanner;

public class G135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 3�� ����̰ų� 5�� ����� ������ �հ� ����� ���
		// ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ѵ�.
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int cnt = 0;
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				cnt++;
				sum = sum + i;
				
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", + (double)sum/cnt);
	}
}
