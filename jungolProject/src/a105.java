import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 *
 *105�� ����
 */
public class a105 {
	public static void main(String[] args) {
		//%,15d
//		15ĭ ���������� ���� ����° ���ڸ��� �ĸ��� ����
		
		// %+,15d
//		�Ǿտ� +�� �ٿ��� �������� ���� ����
		System.out.printf("%15s%,15d%+,15d%n","Seoul",10312545,91375);
		System.out.printf("%15s%,15d%+,15d%n","Pusan",3567910,5868);
		System.out.printf("%15s%,15d%+,15d%n","Incheon",2758296,64888);
		System.out.printf("%15s%,15d%+,15d%n","Daegu",2511676,17230);
		System.out.printf("%15s%,15d%+,15d%n","Gwangju",1454636,29774);
		
		//�޸� ��¹� 1
		int cash = 10000000; //cash ����

		String comma_cash = ""; // ����ִ� ����
		comma_cash = String.format("%,d",cash);
		System.out.println(comma_cash);


		//�޸� ��¹� 2

		String cash2 = "5000000";
		String comma_cash2="";

		NumberFormat nf = NumberFormat.getInstance();
		comma_cash2 = nf.format(Integer.parseInt(cash2)); //string �� int ������
		
		// Interger.parseInt(String s, int radix)
		// �������� ���ڿ��� ù��° ���� ������ �ް� ��ȯ�� �������� �Է��ϸ� �ش� ������ ���� Int ������ ��ȯ�Ͽ���
		System.out.println(comma_cash2);
		


		
	}

}
