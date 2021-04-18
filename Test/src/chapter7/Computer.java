package chapter7;

public class Computer extends Calculator {

//	@Override
//	double areaCircle(double r) {
//		return super.areaCircle(r);
//	}
//	
	@Override
	double areaCircle(double r) {
		return Math.PI*r*r;
	}

}
