package b.arm;

public class MyClosable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("--- closed");
		
	}

}
