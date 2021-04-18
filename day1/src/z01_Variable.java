/** 
 * ctrl s 저장
 * ctrl f11 컴파일 후 실행
 */
public class z01_Variable {
	public static void main(String[] args) {
		System.out.println("하위");
		
//변수 데이터를 메모리에 저장하기
/*형 타입: 정수형 byte(1), short(2), int(4), long(8)
			실수형 float(4), double(8)
			문자형 char(2) 문자 한글자 'a','b','c'
			논리형 boolean True/False 
*/
		int a = 500;
//		변수명 명명규칙
//		예약어는 사용하면 안된다.
//		중복으로 사용 불가
//		숫자로 시작하면 안된다
//		특수문자 _ $ 두가지만 가능
//		대소문자가 구분된다
//		길이의 제한이 없다 
		int numberOfApple = 3; // 가독성을 위해 대문자 사용
//		b = 3; <<- 선언전에 변수사용 불가능
		byte b = 4; //변수의 선언, 초기화(처음 데이터를 넣음)
		b = 5;
		// 하나의 변수엔 하나의 데이터만 저장이 가능 -> 마지막에 저장된 값 출력
		System.out.println(b);
		int c;
		c = 12;
		System.out.println(c);
		
		short s = 3;
		
		long x = 1234567890123L; // long 타입의 데이터에는 L  or l을 붙여줌
								// 리터럴 접미사 
//		float f = 3.14;  8바이트 정보를 4바이트에 넣으려 하니 타입이 미스매칭 되어서 에러가 남
		float f = 3.14f; // 리터럴 접미사 F or f
		double dd = 3.14;// 리터럴 접미사 D or d 생략가능
		char ch = 'a';
		ch = 'z';
		
		//참 true / 거짓 false
		
		
		//변수: 변할수 있는수
		//상수: 일정한 수, 프로그램사용중 값을 변경 못하게 막는것 final
		//상수에 권장되는 명명규칙 : 모두 대문자로 구성
		int g = 4;
		g = 5;
		
		final double PI = 3.14; // final 변함없이 
		final int NUMBER_OF_APPLE;
		
		String name = "김동우";
		
		//리터럴 접미사 long, float, double
		
		int y = 5;
		System.out.println(3 + y);
		System.out.println("안녕"+ "하이");// 문자열의 덧셈연산 : 이어붙여줌
		System.out.println("ab"+ 3);// 문자열 + 비문자열
		// 				   "ab"+"3" -> 문자열 + 문자열로 바꿔서 인식함
		System.out.println("cd"+4+2); //cd42
		System.out.println(3+4+"HI"+3+4); //7HI34
						 //3+4+"HI"+"3"+"4"
		int aa = 3;
		int bb = 5;
		System.out.println(aa+","+bb);//3+5
//swap (교환)

		int temp;
		temp = aa;
		aa = bb;
		bb = temp;
		
		
		System.out.println(aa + "," + bb);// 코드블록 기억할 것
		// 좋은 코드블록 기억할것 항상
		// temp 교환해주는 값을 표기할때 많이 쓰는것
		//api document 기억 ---> 모르는것 찾을때 gogo
		
		int xx = 1; //3
		int yy = 2; //1
		int zz = 3; //2
		
		int ff;
		ff = xx;
		xx = zz;
		zz = yy;
		yy = ff;
		System.out.println(xx+","+yy+","+zz);
		System.out.println(xx+','+yy+','+zz);
		//이항연산시
// 두 피연산자는 같은 타입이어야 한다. 타입이 다르면, 컴파일러가 큰타입으로 자동형변환 해준다
// 결과도 같은 타입으로 나온다
// int형 보다 작은 범위의 타입은 이항연산시 int형으로 형변환된다
// byte, short, int, char
		byte gg = 3;
		byte hh = 4;
		System.out.println(gg+hh);
		
		char uu = 'a';
		char ww = 'b';
		System.out.println(uu+ww);
		
		
	}//end of main
}//end of class
