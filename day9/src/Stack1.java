import java.util.Stack; //import
/**
 * 
 *
 *
 */
public class Stack1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); //int�� ���� ����
		stack.add("�赿��");
		stack.add("�̹̹�");
		stack.add("������"); // push �۾� ?
		
		
		System.out.println("stack �ȿ� �̹̹�����Ȯ�� : " + stack.contains("�̹̹�"));
		System.out.println("stack size Ȯ�� : " + stack.size());
		System.out.println("stack ���� ���� �ִ°� : " + stack.peek());// ���� ���ð� Ȯ��
		
		System.out.println("0��° �ε��� Ȯ�� : " + stack.elementAt(0));//0��° ��������� 
		System.out.println("1��° �ε��� Ȯ�� : " + stack.elementAt(1));//1��° ��������� 
		System.out.println("2��° �ε��� Ȯ�� : " + stack.elementAt(2));//2��° ��������� 
		System.out.println("�赿�� ���� �ε��� Ȯ�� : " + stack.indexOf("�赿��"));//�赿�� �ε��� ��ġ
		stack.remove(1); // 1�� �ε��� ����
		stack.set(0, "������");// 0�� �ε����� ����
		System.out.println("stack size Ȯ�� : " + stack.size());
		System.out.println("stack ���� ���� �ִ°� : " + stack.peek());// ���� ���ð� Ȯ��
		System.out.println(stack.pop()); // ������ ���� �̾Ƴ�
		System.out.println("0��° �ε��� Ȯ�� : " + stack.elementAt(0));//0��° ��������� 
//		System.out.println("1��° �ε��� Ȯ�� : " + stack.elementAt(1));//1��° ��������� 
//		�� �ε����̱� ������ ������
//		System.out.println("2��° �ε��� Ȯ�� : " + stack.elementAt(2));//2��° ��������� 
//		�� �ε����̱� ������ ������
		
		stack.setSize(5);// 5�ε������� ������ null ����
		System.out.println(stack.elementAt(2)); // 2�� ����ֱ� ������ null ����
		
		System.out.println("0��° �ε��� Ȯ�� : " + stack.elementAt(0));//0��° ��������� 
		System.out.println("1��° �ε��� Ȯ�� : " + stack.elementAt(1));//1��° ��������� 
		System.out.println("2��° �ε��� Ȯ�� : " + stack.elementAt(2));//2��° ��������� 
		
		
		
		
	}
}
