/**
 * 				3+4
 * 연산자   :+ 기호 or 단어
 * 피연산자 : 3, 4
 * ctrl + shift + c = 해당 줄 주석
 * // ctrl + alt + 위/아래 방향키 : 커서행 or 블럭행을 방향으로 복사
 * ctrl shift v : 클립보드에 뭐가 저장되있는지 확인
 */
public class z02_Operator {
	public static void main(String[] args) {
//		연산자
//		단항, 이항, 삼항, 대입연산자
//		단항연산자 : 피연자의 개수가 한개인것
//			++ -- + !
		int a = 3;
		++a; // 전치증감연산자 a = a+1
		a++; // 후치증감연산자 a = a+1
		
		a= 3; 
		System.out.println("전치증감연산자");
		System.out.println(++a); //4  증감 후 사용
		System.out.println(a);	// 4
		
		a= 3; 
		System.out.println("후치증감연산자");
		System.out.println(a++); // <<< 이렇게 쓰는건 권장사항 아님 사용 후 증감
		System.out.println(a);
		
		a = 3;
		System.out.println(--a); //2
		System.out.println(a);	//2
		
		a = 3;
		System.out.println(a--);//3
		System.out.println(a);//2
		
		a =3;
		System.out.println(-5);
		System.out.println(-a);
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);//논리부정 연산자: 논리값에만 연산가능, 반대로 바꿈		
		
//		이항연산자 : 피연산자의 갯수가 두개인것
//		두개의 피연산자가 타입이 같아야 연산이 가능함.
//		타입이 다르면 범위큰 방향으로 자동 형변환됨.
//		연산 결과도 같은 타입으로 나온다
//		산술, 비교, 논리, 비트
//		산술: + - * / %
		System.out.println(7+3); //10
		System.out.println(7-3);
		System.out.println(7*3);
		System.out.println(7/3);
		System.out.println(7%3);
		

//		비교연산자 : 연산결과는 true / false 로 나온다
//		< > <= >= ==
		System.out.println(3 <= 7);
		System.out.println(3 == 7);
		
//		논리 연산자 : && || ^         :효율적인 연산을 한다
//		하나라도 false 면 false
		System.out.println("논리연산자");
		System.out.println(true && true); //true
		System.out.println(false && true); //true
		System.out.println(true && false); //true
		System.out.println(false && false); //true
		
//		하나라도 true면 true 
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
//		두값이 다르면 true 
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		
		System.out.println(3+4 < 10 && 5*2 == 10);
		
//		삼항연산자: 피연산자의 개수가 3개인 연산자
//				조건식  ? 참인경우: 거짓인경우
		int c = 3 < 6 ? 100 : 0;
		System.out.println(c);
//		대입 연산자 : = 와 이항연산자의 조합
//		+= -= *= /= %= &=
		a = 3;
		a += 2;
		System.out.println(a);
		a -= 2;
		a *= 2;
		a /= 2;
		a %= 2;
		
//		% 나머지연산자 --> 바꿀수 있으면 바꾸는것이 좋다 연산이 오래걸림
		int n = 7;
		
		System.out.println(n%2 == 0 ? "짝수" : "홀수");
		System.out.println(n%2 == 1 ? "홀수" : "짝수");
		System.out.println(n%3 == 0 ? "3의배수이다" : "3의배수가 아닙니다");
		System.out.println(n%7 == 0 ? "토요일 입니다" : "토요일이 아닙니다");
		
//		단항 연산자 중 캐스팅 연산자 (=형변환 연산자)
		
		int f = 5;
		double d = f; // 데이터의 손실이 없는경우는 자동 형변환 해줌 (묵시적 형변환)
		System.out.println(d);
		d = 3.14;// 에러가 발생 데이터 손실이 발생하는 경우
		f = (int)d; //강제 형변환
		System.out.println(f);
		
//		문자의 코드값을 알고 싶을때, 코드값을 기준으로 문자를 알고 싶을때
		char ch = 'a'; // 97 
		System.out.println((int)ch); //타입 변환
		System.out.println((char)98);
		
	}//end of main
}//end of class
