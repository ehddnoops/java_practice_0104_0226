import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		int num = 0;
		boolean t = true;
		int score[] = null;
		int sum = 0;
		double avg = 1;
		int max = 0;
		
		while(t) {	
		
		System.out.println("=======================================");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("=======================================");
		System.out.println("선택> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a == 1) {
			System.out.println("학생수> ");
			num = sc.nextInt();
			score = new int[num];
		} else if (a == 2) {
			for (int i = 0; i < num; i++) {
				System.out.println("score[ "+i+"] >");
				score[i] = sc.nextInt();
			} 
		} else if (a == 3) {
				for (int i = 0; i < num; i++) {
					System.out.println("score["+i+"]> "+score[i]);
				}
		} else if (a == 4) {
			for (int i = 0; i < num; i++) {
				if (max < score[i]) {
					max = score[i];
				}
				sum += score[i];
			}
			avg = sum / num;
			System.out.println("최고 점수: "+max);
			System.out.println("평균 점수: "+avg );
		} else if (a == 5) {
			t = false;
			
		}
	}
		System.out.println("프로그램 종료");
	}

}
