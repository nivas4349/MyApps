public class MainClass {

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.main(args);
		p.printSomething();
		
		//checking for diff
		Palindrome.main(args);
		Palindrome.printSomething();
	}

}
