package chapter6;

import java.lang.reflect.Method;

public class PrintAnnotationEx {
	public static void main(String[] args) {
		
		Method declaredMethods[] = Service.class.getDeclaredMethods();
		
		
		for(Method method:declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation =method.getAnnotation(PrintAnnotation.class);
				
				System.out.print(method.getName());
				
				for(int i = 0;i<printAnnotation.num();i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new Service());
					
				} catch (Exception e) {
					
				}
				
			}
		}
		
	}

}
