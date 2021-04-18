
public class gugudan {
	public static void main(String[] args) {
		int a;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				a = i*j;
				System.out.printf("%d * %d = %d ",i,j,a);
			}
			System.out.println();
		}
	}

}

