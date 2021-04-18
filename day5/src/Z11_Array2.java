/**
 * (1차원 )배열 : 같은 타입 변수들의 묶음
 * 2차원 배열 : 1차원이하 배열들의 묶음
 * 3차원 배열 : 2차원이하 배열들의 묶음
 */
public class Z11_Array2 {
	public static void main(String[] args) {
//		int[] arr; // 배열 변수의 선언
//		arr = new int[3];// 배열변수 객체생성
//		
//		int[] brr = new int[3];// 배열변수 선언, 객체생성 한번에
//		
//		int[] crr = {1,2,3};// 배열변수 선언, 객체생성, 초기화를 한번에
//		
//		int[] drr = new int[] {1,2,3};//  배열변수 선언, 객체생성, 초기화를 한번에
//		
//		
//		int[][] a = {{1,2,3},{4,5,6}}; 
//		
//		int[][] b;
//		b = new int[2][3];
//		
//		b[0][0] = 1;
//		b[0][1] = 2;
//		b[0][2] = 3;
//		b[1][0] = 4;
//		b[1][1] = 5;
//		b[1][2] = 6;
//		
//		int[][] c = new int[2][3];
//		
//		int[][] d = new int[][]{{1,2,3},{4,5,6}};
//		
//		
////		d[0][0]
//		
//		
		int[][] a = {{1,2,3},
					{4},
					{5,6}};
		
		
		
		//가변배열, 3행 2열
		
		
		
		
		
////		System.out.println(d.length);
////		System.out.println(d[0].length);
////		for (int i = 0; i < d.length; i++) {
////			for (int j = 0; j < d[0].length; j++) {
////				System.out.print(d[i][j]+",");
////				
////			}
////			System.out.println();
////		}
////		
////		int[] err = new int[4];
////		err[3] = 8;
//		
////		int[] frr = {1,3,5,2,4,6};
////		for (int i = 0; i < frr.length-2; i++) {
////			System.out.println(frr[i]+frr[i+1]+frr[i+2]);
////		}
////		
////		
////		int[][] f = {{1,2},{3,4},{5,6},{7,8}};
////		
////		for (int i = 0; i < f.length; i++) {
////			for (int j = 0; j < 2; j++) {
////				System.out.println(f[i][0]+f[i][1]);
////			}
////			
////		}
////		
////		
////		
//		
////		1,1,0,0,0
////		0,1,0,0,0
////		1,1,0,0,0
////		1,0,1,1,1
////		1,1,1,0,1
////		
////		1만 따라서 움직이는 경로 (상하좌우)
//		
////		
//		int[][] z ={{1,1,0,0,0},
//					{0,1,0,0,0},
//					{1,1,0,0,0},
//					{1,0,1,1,1},
//					{1,1,1,0,1}};

		//z[0][0] => z[4][4] 이동, 상하좌우로만 이동가능, 1은길, 0은벽
		//이동중의 좌표를 출력해주세요

//		좌표가 r = 0,c = 0 => 상하좌우 칸중 1길인 곳을 따라서 이동 
//		배열의 범위를 벗어나면 안된다.
//		r,c 상:r-1,c 하:r+1,c 좌:r,c-1 우:r,c+1
//		4,4까지 가면 종료
//		
//		int r = 0;
//		int c = 0; // 시작 좌표 초기화
//		
//		while(true) {
//			System.out.println(r+","+c);// 이동중인 좌표출력
//			if(r == 4 && c == 4) {
//				break;
//			}
//			
//			z[r][c] = 0;
//			if(r - 1 >= 0  && z[r-1][c] == 1) {
//				r = r - 1;
//			} else if(r + 1 < z.length&& z[r+1][c] == 1) {
//				r = r + 1;
//			} else if(c-1 >= 0 && z[r][c-1] == 1){
//				c = c - 1;
//			} else if(c + 1 < z[0].length && z[r][c+1] == 1) {
//				c = c + 1;
//			}
//			
//			
//		}
//		
		
//		자바의 기본문법 (배열까지)
//		문자열, 정렬, 클래스
//		알고리즘 설계기법 @@@@ 배우자 @@@@@
//		자료구조: 배열, 컬렉션 프레임워크(List, set, Map)
//		자바 문법, 코딩테스트, 
//		배열 중요 @@@@@@(성능)
//		알고리즘 : 정올, 백준, SWEA,
	
		
		
		
		
		
//		자바, HTML, css, JSP/Servlet JavaScript, JQuery
//		Spring SpringBoot Vue.js
//		SW역량테스트
//		프로젝트
//		자바자격증
		
		int[][] y = {{9,8,7,6}, //3*4
					{5,4,3,2},
					{1,0,1,7}};
//		9 8 7 6 행우선 순회
//		5 4 3 2 
//		1 0 1 7 
//		
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[0].length; j++) { //y[0].length
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		
//		9 5 1 열우선 순회
//		8 4 0 
//		7 3 1 
//		6 2 7 
//		
		for (int i = 0; i < 4; i++) { // y[0].length열
			for (int j = 0; j < 3; j++) { // 행
				System.out.print(y[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}//end of main
}//end of class
