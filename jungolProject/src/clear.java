import java.text.DecimalFormat;

/**
 *
 *105¹ø ¹®Á¦
 *
 *
 */
public class clear {
	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("#,##0");
		int a = 10312545;
		String money = formatter.format(a);
		System.out.println(money);
	}

}
