package thisIsJava;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql db에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySql db에서 삽입");
			
	}

	@Override
	public void update() {
		System.out.println("MySql db에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql db에서 삭제");
		
	}
	
	

}
