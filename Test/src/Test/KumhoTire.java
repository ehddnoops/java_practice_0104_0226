package Test;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // �ڽİ�ü �����ڿ��� �θ� ��ü �����ڸ� ȣ���� �� ����ϴ� �� super 
	}
	@Override
	public boolean roll() { // �ڽ� Ŭ���� roll�޼��� ������ override ���� �ڵ��� �޼���� ���ϰ� �ʿ�
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "KumhoTire ����" + (maxRotation - accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location+"Ÿ�̾� ��ũ");

			return false;
		}

	}
}
