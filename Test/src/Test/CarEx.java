package Test;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.fL = new HankookTire("�տ���",15);
				break;
			case 2:
				System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
				car.fR = new KumhoTire("�տ�����",13);
				break;
			case 3:
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.bL = new HankookTire("�տ���",14);
				break;
			case 4:
				System.out.println("�� ������ �ѱ�Ÿ�̾�� ��ü");
				car.bR = new KumhoTire("�տ���",17);
				break;
			}
			System.out.println("----------");
		}
		
	}

}
