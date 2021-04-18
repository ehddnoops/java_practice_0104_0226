package Test;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // 자식객체 생성자에서 부모 객체 생성자를 호출할 때 사용하는 것 super 
	}
	@Override
	public boolean roll() { // 자식 클래스 roll메서드 재정의 override 값을 뒤덮음 메서드라 리턴값 필요
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명" + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location+"타이어 펑크");

			return false;
		}

	}
}
