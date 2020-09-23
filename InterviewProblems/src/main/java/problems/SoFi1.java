package main.java.problems;

public class SoFi1 {
		public static void main(String... args) {
			int a = begin(2);
			int b = begin(begin(3));
			int c = begin(begin(begin(4)));
			int d = begin(begin(begin(begin(3))));
			
			String e = "" + a + b + c + d;
			
			a = (int) Math.pow(Integer.parseInt(e), begin(c - 1));
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
			System.out.print(d);
		}
		
		private static int begin(int in) {
			if (in >= 3) {
				return begin(1);
			} else if (in >= 2) {
				return 2;
			} else if (in >= 1) {
				return 1;
			}
			return 0;
		}
}
