package src.main.java.UpCastingDownCasting;

public class UpCasting {

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		ParentClass parentClass = (ParentClass) childClass;
		childClass.parentMethod();
		parentClass.parentMethod();
		((ChildClass) parentClass).childMethod1();
	}
}
