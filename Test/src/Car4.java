
public class Car4 {

	int gas;

	void setgas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("������ ���׿�");
			return false;
		}
		System.out.println("������ �ֳ׿�");
		return true;
	}

	void drive() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޷���  ���� ���� ������ " + gas);
				gas--;
			} else {
				System.out.println("����ϴ�"+gas);
				return;
			}
		}
	}

}
