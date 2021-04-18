package chapter8Ex;

public class ActionEx {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("บนป็");
			}
			
		};
		action.work();
	}

}
