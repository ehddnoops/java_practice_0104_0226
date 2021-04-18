import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 *
 *105번 문제
 */
public class a105 {
	public static void main(String[] args) {
		//%,15d
//		15칸 오른쪽으로 정렬 세번째 숫자마다 컴마가 붙음
		
		// %+,15d
//		맨앞에 +를 붙여줌 나머지는 위와 같음
		System.out.printf("%15s%,15d%+,15d%n","Seoul",10312545,91375);
		System.out.printf("%15s%,15d%+,15d%n","Pusan",3567910,5868);
		System.out.printf("%15s%,15d%+,15d%n","Incheon",2758296,64888);
		System.out.printf("%15s%,15d%+,15d%n","Daegu",2511676,17230);
		System.out.printf("%15s%,15d%+,15d%n","Gwangju",1454636,29774);
		
		//콤마 찍는법 1
		int cash = 10000000; //cash 선언

		String comma_cash = ""; // 비어있는 문자
		comma_cash = String.format("%,d",cash);
		System.out.println(comma_cash);


		//콤마 찍는법 2

		String cash2 = "5000000";
		String comma_cash2="";

		NumberFormat nf = NumberFormat.getInstance();
		comma_cash2 = nf.format(Integer.parseInt(cash2)); //string 을 int 형으로
		
		// Interger.parseInt(String s, int radix)
		// 숫자형의 문자열을 첫번째 인자 값으로 받고 변환할 진수값을 입력하면 해당 진수에 맞춰 Int 형으로 반환하여줌
		System.out.println(comma_cash2);
		


		
	}

}
