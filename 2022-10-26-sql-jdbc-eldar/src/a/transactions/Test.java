package a.transactions;

public class Test {

	public static void main(String[] args) {
		
		try {
			BusinessLogic bl = new BusinessLogic();
//			bl.deposit(1, 500);
			bl.withdraw(2, 500);
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
