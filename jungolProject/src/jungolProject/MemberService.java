package jungolProject;

public class MemberService {
	public boolean login(String id, String password) {
		if("hong".equals(id) && "1234".equals(password)) {
			return true;
		}else {
			return false;
	}
	}
		
	 void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}

}
