import java.util.Scanner;
import java.util.Arrays;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� ������");
		int asize = sc.nextInt();
		System.out.println("b�� ������");
		int bsize = sc.nextInt();
		
		int arr[] = new int[asize];
		int brr[] = new int[bsize];
		int result[] = new int[asize+bsize];
		int result2[] = new int[asize+bsize];
		
		for (int i = 0; i < asize; i++) {
			System.out.println("arr�� �� ���� ��������");
			arr[i] = sc.nextInt();
			
		}
		for (int j = 0; j < bsize; j++) {
			System.out.println("brr�� �� ���� ��������");
			brr[j] = sc.nextInt();
		}
		System.arraycopy(arr, 0, result, 0, arr.length);
		System.arraycopy(brr, 0, result2, 0, brr.length);
		
		
		for (int i = 0; i < result2.length; i++) {
			arr[]
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
	}

}
