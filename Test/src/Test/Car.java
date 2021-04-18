package Test;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class Car {

	Tire fL = new Tire("앞왼쪽", 6); // 1번타이어
	Tire fR = new Tire("앞오른쪽", 2);
	Tire bL = new Tire("뒤왼쪽", 3);
	Tire bR = new Tire("뒤오른쪽", 4);

//	Tire tires[] = {new Tire("앞왼쪽", 6),new Tire("앞오른쪽", 2),new Tire("뒤왼쪽", 3),new Tire("뒤오른쪽", 4)};
	
	int run() {
		System.out.println("자동차가 달린다");
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
		System.out.println("멈춤");
	}


}