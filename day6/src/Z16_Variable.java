/**
 *���� -��������, ��������(�ν��Ͻ�����, static ����)
 *�������� : �޼��� ���ʿ��� ������ ����, local variable
 *		  ��������-���� �����
 *		  ������ġ-Callstack
 *		  �Ҹ����-������ ���Ե� ���� ���������� "���"����
 *�ν��Ͻ� ����: Ŭ���� ���� �޼��� �ٱ��ʿ��� ������ ���� (fields), non-static
 *			 ��������-��ü������ (new)
 *			 ������ġ-Heap
 *			 �Ҹ����-���������� �������� GC�� �������ش� .(�������÷���)
 *static ����:Ŭ���� ���� �޼��� �ٱ��ʿ��� ������ ���� (fields), Ŭ��������
 *			 ��������-Ŭ������ ó�� �ε��ɶ�
 *			 ������ġ-class area, method area
 *			 �Ҹ����-���α׷� ����ñ���, �Ⱦ�����
 *
 */
public class Z16_Variable {
	public static void main(String[] args) {
//		sum = 3; 
		int sum = 0;// �������� 
		System.out.println(sum);// �ʱ�ȭ�� �ؾ� ����Ҽ� �ִ�.
		sum = 3;
		
		
	}//end of main

}//end of class


class Var{ //Ŭ���� 
	int size; // �ν��Ͻ� ����
	static int tall; // static ����
	void print() { // �޼���
		int a;
	}
}
