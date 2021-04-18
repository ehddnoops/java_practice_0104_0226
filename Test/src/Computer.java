import java.util.Scanner;

public class Computer {
	Scanner sc = new Scanner(System.in);
//	첫번째 방식
//	int sum1(int values[]) {
//		
//		int sum = 0;
//		for (int i = 0; i < values.length; i++) {
//			sum += values[i];
//		}
//		
//		
//		
//		return sum;
//	}
	int sum2(int ...values) {
		
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
			sum += values[i];
			System.out.println(sum);
		}
		
		
		
		return sum;
	}

	
	
	
	
	
	
	
	
	
	
	
}
