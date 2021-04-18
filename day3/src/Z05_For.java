/**
 * 자바의 반복문
 * for, while, do~while
 * 
 * 
 * 
 */
public class Z05_For {
	public static void main(String[] args) {
//		for(초기식		; 조건식 ;증감식) {
//		for(int i = 0; i < 3; i++) {
//			실행문;
//			실행문;
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
		
		// 조건식을 안쓰면 true로 인정 - > 무한루프
		

		System.out.println();
		System.out.println("========");
//		1~10출력 
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
		
//		System.out.println(""); 가로안의 내용을 출력후 줄바꿈
//		System.out.print(""); 가로의 내용을 출력 
//		System.out.printf(); 가로의 내용을 포멧에 맞춰 출력 
		
		//printf() 알아보기
		
System.out.println();
		
		String name = "동우";
		System.out.printf("안녕%s야\n", name);
		System.out.printf("안녕" + name + "야\n");
		System.out.printf("과일 :%s, %s, %s\n", "사과", "귤", "바나나");
		System.out.printf("[%s]\n", "hi");
		System.out.printf("[%4s]\n", "hi");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main

}//end of class