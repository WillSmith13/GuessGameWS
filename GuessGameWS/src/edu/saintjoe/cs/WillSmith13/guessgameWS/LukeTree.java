package edu.saintjoe.cs.WillSmith13.guessgameWS;

// Here are our data members
// Store tree's height as feet
public class LukeTree {
	 private int height;
	// Store tree's age measured in parsecs 
	 int age;
	
	 String species;
	
	public static void main(String[] args) {
		LukeTree treeOne;
		LukeTree treeTwo;
		
		treeOne = new LukeTree();
		treeTwo = new LukeTree();
		
		// Directly access the data member "height" of object referred to by "treeOne"
		treeOne.height = 14;
		// Invoke the method named "SetHeight" on the object referred to by "treeTwo"
		treeTwo.setHeight(80);
		
		//Directly access the data member "species of the objects referred to by "treeOne" and "treeTwo"
		treeTwo.species = "Elm";
		treeOne.species = "Oak";
		
		treeOne.setAge(20);
		treeTwo.setAge(50);
		
		
		System.out.println("Tree treeOne height is " + treeOne.getHeight() + " TreeOne age is " + treeOne.age);
		System.out.println("Tree treeOne name is " + treeOne.species + " Treetwo name is " + treeTwo.species + "tree one age is " + treeOne.age);

		
	}

	// Here are our methods
	public int getHeight () {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public int getAge () {
		return height;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
}
