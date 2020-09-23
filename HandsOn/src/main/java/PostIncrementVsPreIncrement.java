public class PostIncrementVsPreIncrement {

	public static void main(String[] args) {
		String firstStr = "Siva";
		String secondStr = "Pasam";
		firstStr += secondStr;
		System.out.println(firstStr);
		firstStr = "Siva";
		//firstStr =+ secondStr; '=+' isn't applicable for string
		System.out.println(firstStr);
	}

}
