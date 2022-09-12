package d.nestedClasses;

public class State {

	private String name;
	private int population;

	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	// inner class
	// can access private members of State
	// any instance of Citizen must belong to an instance of State
	public class Citizen {

		private String name;

		public Citizen(String name) {
			super();
			this.name = name;
			population++;
		}

		public String getName() {
			return Citizen.this.name;
		}

		public String getStateName() {
			return State.this.name;
		}

	}
	
	public static class Flag{
		private String name;

		public Flag(String name) {
			super();
			this.name = name;
		}

		@Override
		public String toString() {
			return "Flag [name=" + name + "]";
		}
		
		
	}

}
