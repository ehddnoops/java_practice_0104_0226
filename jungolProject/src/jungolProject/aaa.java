package jungolProject;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		double avg = 0;
		while(run) {
			System.out.println("==============");
			System.out.println("1.�л��� 2/. �����Է� 3. ��������Ʈ 4. �м� 5. ����");
			System.out.println("==============");
			System.out.println("����>");
			
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				System.out.println("�л���>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = sc.nextInt();
				}
				
			} else if(selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores["+i+"]>"+scores[i]);
					
				}
			} else if(selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {
					if(scores[i]>max) {
					max = scores[i];	
					}
					sum += scores[i];
				}
				avg = sum/studentNum;
				System.out.println("�ְ� ����:" +max);
				System.out.println("��� ����:" +avg);
				
			} else if(selectNo == 5) {
				run = false;
				System.out.println("1231");
			}
		
			
		}
		
		
		
		
		
		
		
	}

}
