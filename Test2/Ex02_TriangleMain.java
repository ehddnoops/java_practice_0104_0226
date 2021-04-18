
import java.util.Scanner;

public class Ex02_TriangleMain extends Ex01_Triangle{

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Ex01_Triangle[] arr = new Ex01_Triangle[3];
      
      for (int i = 0; i<arr.length; i++) {
         System.out.print("�ʺ� �Է� >>");
         int width = sc.nextInt();
         System.out.print("���� �Է� >>");
         int height = sc.nextInt();
         arr[1] = new Ex01_Triangle(width, height);
      }
      
      for (int i = 0; i<arr.length-1; i++) {
         System.out.println((i+1) + "�� �ﰢ�� ---");
         arr[i].output();
      }
      
      sc.close();

   }

}