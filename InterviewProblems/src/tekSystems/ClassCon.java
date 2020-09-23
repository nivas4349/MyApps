package tekSystems;

import java.util.ArrayList;

public class ClassCon {

	private ClassCon() {

	}

	protected ArrayList<String> as() {
		return new ArrayList<String>();
	}

	// diff question
	public static void main(String[] args) {
		Boolean b = new Boolean("false");
		System.out.println(b);
		
		Double d = new Double("17.46d");
		System.out.println(d);
		
//		Character c = new Character("C");
//		Integer i = new Integer();
		Float f = new Float(23.46);
		System.out.println(f);
		
	}
}
