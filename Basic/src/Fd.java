
public class Fd {
	public static void main(String[] args) {
		int a = -1;
		int b = 0;
		int c= a++;
		int d= --b;
		System.out.println(a + b-- + ++c - d--);
	}

}
