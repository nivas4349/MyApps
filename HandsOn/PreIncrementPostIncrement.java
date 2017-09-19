
public class PreIncrementPostIncrement {

	public static void main(String[] args) {
		int x = 3;
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		x = 3;
		x = x++;
		System.out.println(x);
		x = ++x;
		System.out.println(x);

		// what's the output of the follwoing code?
		x = 3;
		int y = 5;
		y = y++;
		y = y++;
		y = y++;
		x = 4 * ++y - 3 + x * y;
		x = x++;
		System.out.println("X=" + x + ", Y=" + y);
	}

}
