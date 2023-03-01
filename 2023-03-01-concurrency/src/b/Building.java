package b;

import java.util.concurrent.CountDownLatch;

public class Building {

	private boolean floor1Open;
	private boolean floor2Open;
	private boolean floor3Open;

	private CountDownLatch latch = new CountDownLatch(3);

	public void openFloor(int floor) {
		switch (floor) {
		case 1:
			if (!floor1Open) {
				floor1Open = true;
				this.latch.countDown();
			}
			break;
		case 2:
			if (!floor2Open) {
				floor2Open = true;
				this.latch.countDown();
			}
			break;
		case 3:
			if (!floor3Open) {
				floor3Open = true;
				this.latch.countDown();
			}
			break;

		default:
			System.out.println("floor " + floor + " is not a floor");
			break;
		}
	}

	public void enterBuilding(String name) {
		try {
			if (this.latch.getCount() != 0) {
				System.out.println("Dear " + name + " building is closed. please wait");
			}
			this.latch.await(); // will block any attempt to enter a closed building
			System.out.println(name + " entered");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
