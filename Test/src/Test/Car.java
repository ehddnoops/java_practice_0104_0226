package Test;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class Car {

	Tire fL = new Tire("�տ���", 6); // 1��Ÿ�̾�
	Tire fR = new Tire("�տ�����", 2);
	Tire bL = new Tire("�ڿ���", 3);
	Tire bR = new Tire("�ڿ�����", 4);

//	Tire tires[] = {new Tire("�տ���", 6),new Tire("�տ�����", 2),new Tire("�ڿ���", 3),new Tire("�ڿ�����", 4)};
	
	int run() {
		System.out.println("�ڵ����� �޸���");
		if (fL.roll() == false) {
			stop();
			return 1;
		}
		if (fR.roll() == false) {
			stop();
			return 2;
		}
		if (bL.roll() == false) {
			stop();
			return 3;
		}
		if (bR.roll() == false) {
			stop();
			return 4;
		}

		return 0;
	}
//int run() {
//	for(int i=0;i<tires.length;i++){
//		if(tires[i].roll()==false) {
//			stop();
//			return(i+1);
//	}
//}
//		return 0;
//
//	}
//
//	
	
	
	
	
	void stop() {
		System.out.println("����");
	}


}