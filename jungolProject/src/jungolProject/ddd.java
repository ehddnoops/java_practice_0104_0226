package jungolProject;

public class ddd {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		int a;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		
		
		
		System.out.println("max: "+max);
	}

}
