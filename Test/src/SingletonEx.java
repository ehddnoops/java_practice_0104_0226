
public class SingletonEx {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj1 = new Singleton();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2= Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("∞∞¿∫ ΩÃ±€≈Ê∞¥√º");
			
			System.out.println(System.identityHashCode(obj1));
			System.out.println(System.identityHashCode(obj2));
		}
		else {
			System.out.println("¥Ÿ∏• ΩÃ±€≈Ê ∞¥√º");
		}
	}

}
