import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 *문자열
 *클래스, 자료구조(List, set, map)
 *
 *
 *
 *
 */
public class Z17_String {
	public static void main(String[] args) {
		String str = "hi";// 문자열만 기본형타입처럼 객체 생성을 허용한다.
		String str2 = new String("hi");
		
		String s1 = "hi";//상수풀(재활용), 권장
		String s2 = "hi";
		String s3 = new String("hi");
		String s4 = new String("hi");
		System.out.println(s1 == s2); // 주소가 같다
		System.out.println(s3 == s4); // 주소가 다르다
		// (문자열)참조형 타입의 내용물 비교 equals 로 비교한다.
		
		int a = 3;
		System.out.println(s1.equals(s2));
		
		//			0123456789
		String s = "aBcdEfgHIJ";
		System.out.println("문자열: "+s);
		System.out.println("문자열의 길이 : "+s.length());
		System.out.println("5번째 위치 글자 : "+ s.charAt(5));
		System.out.println("문자열 포함여부 : " + s.contains("dE"));
		System.out.println(s.concat("xyz")); // s+"xyz"
		System.out.println("문자열이 나타나는 위치 "+ s.indexOf("cd"));
		System.out.println("소문자변경 : "+s.toLowerCase());
		System.out.println("대문자변경 : "+s.toUpperCase());
		System.out.println("부분 문자열 추출 : "+s.substring(2,6));
		System.out.println("문자열 교환 : " + s.replace("EFg", "xxx"));
		
		s= "	\t \n 안녕 나는 김동우야 \t \n";
		System.out.println(s.trim()); // 앞 뒤의 화이트 스페이스 제거
		s = "호랑이,토끼,다람쥐,고양이,기린";
		String[] srr = s.split(","); // 문자열을 특정 구분자로 쪼갬 // 문자열의 배열을 리턴한다
		System.out.println(Arrays.toString(srr));
		
//		
//		String a = "ILoveYou";
//		'o' 가 포함되어 있나?
//		'o' 몇개 포함되어있나?
//		전부 소문자로 변경
//		ILoveMe 로 변경해서 출력
//		글자 길이 출력
//		대문자만 찾아서 출력
//
		
		
//		String b = "hello";
//		역순으로 출력
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
		
		
		// 대문자 출력
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if('A' <= ch && 'Z' >= ch) {
				System.out.println(ch + " ");
				
			}
		}
		System.out.println();
		
		
		
		String b = "hello";
		//7. 역순으로 출력
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
		
		
//		  // 버퍼를 만듭니다.
//	      StringBuffer strBuffer = new StringBuffer(); 
//	      //변환할 문자열
//	      String str4 = "Reverse this strings";
//	      // 버퍼에 문자열을 넣고
//	      strBuffer.append(str);
//	      // 버퍼안에 reverse()를 이용해 거꾸로 출력
//	      System.out.print(strBuffer.reverse());
//		
//	      숫자 => 문자열
	      String s9 = "";
	      int i9 = 0;
	      s9 = 38+""; //숫자(비문자열) -> 문자열 변경
		
	      
//	      문자열=> 숫자로 변경
	     s9 = "123";
	     i9 = Integer.valueOf("123");
	     long ll= Long.valueOf("12312313");
	     boolean z = Boolean.valueOf("true");
	     System.out.println(s9 + 1);
	      
	      
	      
//	           기본형			Wrapper 클래스 
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
	     Integer q = new Integer(3); // 원칙
	     Integer qq = new Integer(p);// 기본형 타입을 객체로 변환하기
	     p = qq.intValue();// 객체를 기본형 타입으로 꺼내기
	     
	     
	      
	      
	      
	      
		
	}//end of main
}//end of class 
