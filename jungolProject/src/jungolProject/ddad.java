package jungolProject;

import java.util.Scanner;

public class ddad {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("================");
			System.out.println("1.����, 2.��� . 3.�ܰ� 4.����");
			System.out.println("================");
			System.out.println("����>");
		
		int num = sc.nextInt();
		int money = 0;
		
		switch(num) {
		case 1:
			System.out.print("���ݾ�>");
			money = sc.nextInt();
			balance += money;
			break;
		case 2:
			System.out.println("��ݾ�>");
			money = sc.nextInt();
			balance -= money;
			break;
		case 3:
			System.out.println("�ܰ�>"+balance);
			break;
		case 4:
		run = false;
		break;
		}
	}
	
	System.out.println("���α׷�����");
	}

}