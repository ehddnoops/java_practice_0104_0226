package Test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_FileOutput {

   public static void main(String[] args) {
      // ����Ʈ ��� ��Ʈ��
      FileOutputStream fos = null;
      BufferedOutputStream bos = null;
      
      try {
         /* FileOutputStream(������ ������ ��� �� ���� �̸�)
          *  - ��� ������ ���ϸ� ���� ���丮�� ���� ����(��� ���)
          *  - ex)   c:/file/alphabet.txt(���� ���)
          */
         fos = new FileOutputStream("alphabet.txt"); // ����
         bos = new BufferedOutputStream(fos);
         
         char ch = 'A';         // �ƽ�Ű �ڵ�  ���� ����
         while (true) {
            bos.write(ch);
            if(ch == 'z') {      // �ƽ�Ű �ڵ�  ���� ����
               break;
            }
            ch++;            // (�ƽ�Ű �ڵ� ǥ ��)���� ���� ��ȯ!
         }
         
         bos.flush(); // ���� ����ֱ�
         
         System.out.println("alphabet.txt ���� ����!");
         
      }catch(IOException e) {
         e.printStackTrace();
      }finally {
         // Buffer�� ����� Ŭ������ finally���� close()�� ���� �޸� ������ ȿ�������� �� �� �ִ�.
         try {
            if(bos != null) {
               bos.close();
            }
            if(fos!= null) {
               fos.close();
            }
         }catch (IOException e) {
            e.printStackTrace();
         }
      }
      
   }

}