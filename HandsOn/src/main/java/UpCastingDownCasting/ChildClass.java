package src.main.java.UpCastingDownCasting;

public class ChildClass extends ParentClass {

	ChildClass() {
		System.out.println("In the constructor of ChildClass");
	}
	public void parentMethod() {
		System.out.println("In parentMethod() of ChildClass");
	}
	
	public void childMethod1() {
		System.out.println("In childMethod1()");
	}

	public void childMethod2() {
		System.out.println("In childMethod2()");
	}

	public static void main(String[] args) {
	}

}
