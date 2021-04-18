package chap11;

public class MemberEx2 {
	public static void main(String[] args) {
		Member2 original = new Member2("blue","È«±æµ¿","12345","25",true);
	
		Member2 cloned = original.getMember();
		cloned.password="67890";
		System.out.println("º¹Á¦°´Ã¼");
		System.out.println(cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);
		
		
		
		
		
		
		System.out.println("¿øº»°´Ã¼");
		System.out.println(original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		

	
	
	}

}
