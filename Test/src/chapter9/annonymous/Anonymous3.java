package chapter9.annonymous;

public class Anonymous3 {
	
	private int field;
	
	public void method(final int arg1, int arg2) {
		
		final int var1=0;
		int var2 = 0;
		
		field = 10;
		
//		arg1=20; // 매개변수와 로컬변수가 익명 객체에서 사용할때 ifnal 특성을 가지고 있다.
//		arg2=20;
		
		Calculatable calc= new Calculatable() {

			@Override
			public int sum() {
				
				int res = field+arg1+arg2+var1+var2;
				
				
				return res;
			}
		};
		
		System.out.println(calc.sum());
		
	};

}
