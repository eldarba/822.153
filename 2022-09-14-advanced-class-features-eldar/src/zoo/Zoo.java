package zoo;

import zoo.interfaces.Flyer;

public class Zoo {

	private Bird[] birds = new Bird[10];
	private Mammal[] mammals = new Mammal[10];
	private Insect[] insects = new Insect[10];
	private Flyer[] flyers = new Flyer[10];
	private int iBirds, iMammals, iInsects, iFlyers;

	public void addAnimal(Animal animal) {
		if (animal instanceof Flyer) {
			flyers[iFlyers++] = (Flyer) animal;
		} else if (animal instanceof Bird) {
			birds[iBirds++] = (Bird) animal;
		} else if (animal instanceof Insect) {
			insects[iInsects++] = (Insect) animal;
		} else if (animal instanceof Mammal) {
			mammals[iMammals++] = (Mammal) animal;
		}
	}

	public Mammal[] getMammals() {
		// create a new array of mammals
		Mammal[] mammals = new Mammal[20];
		// copy all mammals to the new array
		System.arraycopy(this.mammals, 0, mammals, 0, iMammals);

		// move all mammals from flyers area as well
		// FOR LOOP
//		for (int i = 0; i < flyers.length; i++) {
//			Flyer flyer = flyers[i];
//		}

		int ind = iMammals;
		// FOR EACH LOOP
		for (Flyer flyer : flyers) {
			if (flyer instanceof Mammal) {
				mammals[ind++] = (Mammal) flyer;
			}
		}
		Mammal[] mammalsShort = new Mammal[ind];
		System.arraycopy(mammals, 0, mammalsShort, 0, ind);
		return mammalsShort;
	}

	// not required in drill
	public Mammal[] getMammalsThatAreNotFlyers() {
		return mammals;
	}

	public Bird[] getBirdsThatAreNotFlyers() {
		return birds;
	}

	public Insect[] getInsectsThatAreNotFlyers() {
		return insects;
	}

	public Flyer[] getFlyers() {
		return flyers;
	}
	
	

}
