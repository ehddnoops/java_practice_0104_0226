import java.math.*;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
public class lotto {
	public static void main(String[] args) {
		
		 Random random = new Random();
	        random.setSeed(System.nanoTime());

	        int min = 1, max = 46;
	        Set<Integer> result = new TreeSet<>();
	        while (result.size() != 6) {
	            result.add(random.nextInt(max - min + 1) + min);
	        }
	        for (int number : result) {
	            System.out.println(number);
	        }
	}
}
