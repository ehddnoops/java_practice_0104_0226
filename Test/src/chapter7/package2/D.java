package chapter7.package2;

import chapter7.package1.A;

public class D extends A{
	
	//CŬ�����ʹ� �޸� D�� A�� �ڽ� Ŭ�����̴�.
	//�׷��� ������ AŬ������ protected �ʵ�, ������, �޼��忡 ���� ����
	//��, new �����ڸ� ����ؼ� �����ڸ� ���� ȣ���Ҽ��� ����,
	//�ڽ� �����ڿ��� super()�� A �����ڸ� ȣ���� �� �ִ�.
	
	
	public D() {
		super();
		this.field="value";
		this.method();
		
		
	}
	

}
