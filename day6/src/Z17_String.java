import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 *���ڿ�
 *Ŭ����, �ڷᱸ��(List, set, map)
 *
 *
 *
 *
 */
public class Z17_String {
	public static void main(String[] args) {
		String str = "hi";// ���ڿ��� �⺻��Ÿ��ó�� ��ü ������ ����Ѵ�.
		String str2 = new String("hi");
		
		String s1 = "hi";//���Ǯ(��Ȱ��), ����
		String s2 = "hi";
		String s3 = new String("hi");
		String s4 = new String("hi");
		System.out.println(s1 == s2); // �ּҰ� ����
		System.out.println(s3 == s4); // �ּҰ� �ٸ���
		// (���ڿ�)������ Ÿ���� ���빰 �� equals �� ���Ѵ�.
		
		int a = 3;
		System.out.println(s1.equals(s2));
		
		//			0123456789
		String s = "aBcdEfgHIJ";
		System.out.println("���ڿ�: "+s);
		System.out.println("���ڿ��� ���� : "+s.length());
		System.out.println("5��° ��ġ ���� : "+ s.charAt(5));
		System.out.println("���ڿ� ���Կ��� : " + s.contains("dE"));
		System.out.println(s.concat("xyz")); // s+"xyz"
		System.out.println("���ڿ��� ��Ÿ���� ��ġ "+ s.indexOf("cd"));
		System.out.println("�ҹ��ں��� : "+s.toLowerCase());
		System.out.println("�빮�ں��� : "+s.toUpperCase());
		System.out.println("�κ� ���ڿ� ���� : "+s.substring(2,6));
		System.out.println("���ڿ� ��ȯ : " + s.replace("EFg", "xxx"));
		
		s= "	\t \n �ȳ� ���� �赿��� \t \n";
		System.out.println(s.trim()); // �� ���� ȭ��Ʈ �����̽� ����
		s = "ȣ����,�䳢,�ٶ���,�����,�⸰";
		String[] srr = s.split(","); // ���ڿ��� Ư�� �����ڷ� �ɰ� // ���ڿ��� �迭�� �����Ѵ�
		System.out.println(Arrays.toString(srr));
		
//		
//		String a = "ILoveYou";
//		'o' �� ���ԵǾ� �ֳ�?
//		'o' � ���ԵǾ��ֳ�?
//		���� �ҹ��ڷ� ����
//		ILoveMe �� �����ؼ� ���
//		���� ���� ���
//		�빮�ڸ� ã�Ƽ� ���
//
		
		
//		String b = "hello";
//		�������� ���
//
//		
		
		String t = "ILoveYou";
		System.out.println(t.contains("o"));
		int c = 0;
		for (int i = 0; i < t.length(); i++) {
		if(t.charAt(i) == 'o') {
			c++;
		}
		}
		System.out.println(c);
		
		System.out.println("===========");
		for (int i = 0; i < t.length(); i++) {
			if(t.indexOf('0') != -1) {
			int index = t.indexOf('o');
			System.out.println(index);
			}
		}
		
		
		int index = t.indexOf("o");
		System.out.println(index);
		index = t.indexOf("o", index+1);
		System.out.println(index);
		
		
		// �빮�� ���
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if('A' <= ch && 'Z' >= ch) {
				System.out.println(ch + " ");
				
			}
		}
		System.out.println();
		
		
		
		String b = "hello";
		//7. �������� ���
		for (int i = b.length()-1; i >= 0; i--) {
			System.out.print(b.charAt(i));
		}
		System.out.println();
		
		
		
		String result = "";
		for (int i = b.length()-1; i >= 0; i--) {
			result = result + b.charAt(i);
		}
		System.out.println(result);
		
		
		
		String result2 = "";
		for (int i = 0; i < b.length(); i++) {
			result2 = b.charAt(i) + result2  ;
		}
		System.out.println(result2);
		
		
//		  // ���۸� ����ϴ�.
//	      StringBuffer strBuffer = new StringBuffer(); 
//	      //��ȯ�� ���ڿ�
//	      String str4 = "Reverse this strings";
//	      // ���ۿ� ���ڿ��� �ְ�
//	      strBuffer.append(str);
//	      // ���۾ȿ� reverse()�� �̿��� �Ųٷ� ���
//	      System.out.print(strBuffer.reverse());
//		
//	      ���� => ���ڿ�
	      String s9 = "";
	      int i9 = 0;
	      s9 = 38+""; //����(���ڿ�) -> ���ڿ� ����
		
	      
//	      ���ڿ�=> ���ڷ� ����
	     s9 = "123";
	     i9 = Integer.valueOf("123");
	     long ll= Long.valueOf("12312313");
	     boolean z = Boolean.valueOf("true");
	     System.out.println(s9 + 1);
	      
	      
	      
//	           �⺻��			Wrapper Ŭ���� 
//	      byte			Byte
//	      short			Short
//	      int			Integer
//	      long			Long
//	      float			Float
//	      double		Double
//	      char			Character	
//	      boolean		Boolean
//	      
	      
	     int p = 3; 
	     Integer q = new Integer(3); // ��Ģ
	     Integer qq = new Integer(p);// �⺻�� Ÿ���� ��ü�� ��ȯ�ϱ�
	     p = qq.intValue();// ��ü�� �⺻�� Ÿ������ ������
	     
	     
	      
	      
	      
	      
		
	}//end of main
}//end of class 
