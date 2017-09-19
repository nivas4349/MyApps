package src.main.java.UpCastingDownCasting;

public class DownCasting {

	public static void main(String[] args) {
//		ParentClass parentClass = new ParentClass();
//		ChildClass childClass = (ChildClass) parentClass;
		ChildClass childClass = (ChildClass) new ParentClass();
		childClass.parentMethod();
	}
}
