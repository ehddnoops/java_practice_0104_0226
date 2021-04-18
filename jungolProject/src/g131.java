import java.util.Scanner;

/**
 * 131¹ø
 * @author ehddn
 *
 */
public class g131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
		for (int i = a; i <= b; i++) {
			System.out.printf("%d ",i);
			
		}
		} else if(a > b) {
			for (int j = b; j <= a; j++) {
				System.out.printf("%d ",j);
				
			}
		} else {
			System.out.printf("%d",a);
		}
	}

}
