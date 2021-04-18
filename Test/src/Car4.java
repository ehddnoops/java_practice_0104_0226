
public class Car4 {

	int gas;

	void setgas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 없네요");
			return false;
		}
		System.out.println("가스가 있네요");
		return true;
	}

	void drive() {
		while (true) {
			if (gas > 0) {
				System.out.println("달려라  지금 현재 가스는 " + gas);
				gas--;
			} else {
				System.out.println("멈춥니다"+gas);
				return;
			}
		}
	}

}
