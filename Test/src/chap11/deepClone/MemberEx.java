package chap11.deepClone;

public class MemberEx {
	public static void main(String[] args) {
		
		Member original = new Member("홍길동",25,new int[] {90,90},new Car("소나타"));
		Member cloned = original.getMember();
	
		cloned.scores[0]=100;
		cloned.car.model="그랜저";
	}

}
