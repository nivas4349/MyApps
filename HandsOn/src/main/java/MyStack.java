import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
		int i = 0;
		while (i < 5) {
			st.push((char) (i + '0'));
			System.out.println(st);
			i++;
		}
		System.out.println(st.pop() == 4 + '0');
		System.out.println(st);
	}

}
