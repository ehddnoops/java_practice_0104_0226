package chap11.deepClone;

public class MemberEx {
	public static void main(String[] args) {
		
		Member original = new Member("ȫ�浿",25,new int[] {90,90},new Car("�ҳ�Ÿ"));
		Member cloned = original.getMember();
	
		cloned.scores[0]=100;
		cloned.car.model="�׷���";
	}

}
