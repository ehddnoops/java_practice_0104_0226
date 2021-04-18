import java.util.Stack; //import
/**
 * 
 *
 *
 */
public class Stack1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); //int형 스택 선언
		stack.add("김동우");
		stack.add("미미미");
		stack.add("땡떙땡"); // push 작업 ?
		
		
		System.out.println("stack 안에 미미미존재확인 : " + stack.contains("미미미"));
		System.out.println("stack size 확인 : " + stack.size());
		System.out.println("stack 가장 위에 있는값 : " + stack.peek());// 다음 나올값 확인
		
		System.out.println("0번째 인덱스 확인 : " + stack.elementAt(0));//0번째 뭐가들었나 
		System.out.println("1번째 인덱스 확인 : " + stack.elementAt(1));//1번째 뭐가들었나 
		System.out.println("2번째 인덱스 확인 : " + stack.elementAt(2));//2번째 뭐가들었나 
		System.out.println("김동우 값의 인덱스 확인 : " + stack.indexOf("김동우"));//김동우 인덱스 위치
		stack.remove(1); // 1번 인덱스 삭제
		stack.set(0, "눈눈눈");// 0번 인덱스값 변경
		System.out.println("stack size 확인 : " + stack.size());
		System.out.println("stack 가장 위에 있는값 : " + stack.peek());// 다음 나올값 확인
		System.out.println(stack.pop()); // 위에서 부터 뽑아냄
		System.out.println("0번째 인덱스 확인 : " + stack.elementAt(0));//0번째 뭐가들었나 
//		System.out.println("1번째 인덱스 확인 : " + stack.elementAt(1));//1번째 뭐가들었나 
//		빈 인덱스이기 때문에 오류남
//		System.out.println("2번째 인덱스 확인 : " + stack.elementAt(2));//2번째 뭐가들었나 
//		빈 인덱스이기 때문에 오류남
		
		stack.setSize(5);// 5인덱스보다 낮으면 null 리턴
		System.out.println(stack.elementAt(2)); // 2번 비어있기 때문에 null 나옴
		
		System.out.println("0번째 인덱스 확인 : " + stack.elementAt(0));//0번째 뭐가들었나 
		System.out.println("1번째 인덱스 확인 : " + stack.elementAt(1));//1번째 뭐가들었나 
		System.out.println("2번째 인덱스 확인 : " + stack.elementAt(2));//2번째 뭐가들었나 
		
		
		
		
	}
}
