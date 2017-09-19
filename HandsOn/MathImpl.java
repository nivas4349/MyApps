import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class MathImpl {

	public static void main(String[] args) {
		int count = 20;
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		int num = 0;
		for (int i = 1; i <= count; i++){
			num = r.nextInt(count);
			System.out.println(num);
		}
	}

}
