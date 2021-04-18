package thisIsJava;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("oracle에서 조회");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("oracle에서 삽입");
			
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("oracle에서 수정");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("oracle에서 삭제");
		
	}
	

}
