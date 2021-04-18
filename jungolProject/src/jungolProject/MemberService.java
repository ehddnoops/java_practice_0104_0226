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
		System.out.println("로그아웃 되었습니다");
	}

}
