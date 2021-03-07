package src.main.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListHandsOn {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("Random");
		strList.add("Random1");
		strList.add("Random2");
		strList.add("Random3");
		strList.add("Random4");

		/*System.out.println(strList);

		for (int i = 1; i <= 4; i++) {
			strList.remove("Random" + i);
			System.out.println(strList);
		}*/

		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(10);

		System.out.println("BEFORE REMOVE: " + nums);

		// this fails because you can't remove using nums.remove(nums(0)) in for(<Java 1.7) loop
		for (Integer integer : nums) {
			if (integer < 3) {
				// not allowed
				nums.remove(integer);
			}
		}
		System.out.println("AFTER REMOVE: " + nums);
		
		List<Integer> toRemove = new ArrayList<>();
		for (Integer integer : nums) {
		    if (integer < 3) {
		        toRemove.add(integer);
		    }
		}

		//this succeeds because you can remove using nums.remove(toRemove(0))
		for (Integer integer : toRemove) {
		    nums.remove(integer);
		}

		System.out.println("AFTER REMOVE: " + nums);
		
		int[] a= new int[10];
	}
}
