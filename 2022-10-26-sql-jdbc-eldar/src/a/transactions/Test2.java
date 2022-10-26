package a.transactions;

public class Test2 {

	public static void main(String[] args) {
		
		try {
			BusinessLogic bl = new BusinessLogic();
			bl.transfer(1, 2, 10);
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
