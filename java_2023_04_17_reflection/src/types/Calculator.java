package types;

public class Calculator {

	// attribute
	private double result;

	// CTOR 1
	public Calculator() {
	}

	// CTOR 2
	public Calculator(double result) {
		super();
		this.result = result;
	}

	// methods
	public void add(double val) {
		this.result += val;
	}

	public void sub(double val) {
		this.result -= val;
	}

	public void mul(double val) {
		this.result *= val;
	}

	public void div(double val) {
		this.result /= val;
	}
	
	public void clear() {
		this.result = 0;
	}

}
