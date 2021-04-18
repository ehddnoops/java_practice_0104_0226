package Test;

public class Tire {
	public int maxRotation; //�ʵ�
	public int accumulateRotation;
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;//������ - > �ʵ� �ʱ�ȭ // ���ϰ� ����
		this.maxRotation = maxRotation;
	}

	public boolean roll() { // �޼���이래 ?
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire ����" + (maxRotation - accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location+"Ÿ�̾� ��ũ");

			return false;
		}
	}

}
