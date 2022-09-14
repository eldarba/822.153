package zoo;

public abstract class Animal {

	public abstract void speak();

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	
}
