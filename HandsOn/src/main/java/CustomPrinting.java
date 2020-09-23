/**
 * @author: Siva Srinivasa Pasam Jun 9, 2020
 *
 */
public class CustomPrinting {

	public static void main(String[] args) {
		CustomPrinting cp = new CustomPrinting();
//		cp.customPrintf(99);
		cp.customPrintf(3);
	}

	public void customPrintf(int i) {
		String inte = "" + i;
		if (inte.length() != 3) {
			int numDigits = 1;
			while (i / 10 > 0) {
				numDigits++;
				i = i / 10;
			}
			for (int j = 0; j < 3 - numDigits; j++) {
				inte = "0" + inte;
			}
		}
		String st = "Siva";
		System.out.printf(st + "%" + (15 - st.length()) + "s%s", "", inte + "\n");
	}

}
