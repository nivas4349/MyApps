package src.main.java.Problems;

import src.main.java.Problems.resources.ListNode;

public class SumOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1.val == 0)
			return l2;
		if (l2.val == 0)
			return l1;
		int i = l1.val;
		int counter = 1;
		while (l1.next != null) {
			l1 = l1.next;
			i = (l1.val * (int) Math.pow(10.0, (double) counter)) + i;
			counter++;
		}
		int j = l2.val;
		counter = 1;
		while (l2.next != null) {
			l2 = l2.next;
			j = (l2.val * (int) Math.pow(10.0, (double) counter)) + j;
			counter++;
		}
		int k = i + j;
		ListNode l;
		ListNode result;
		l = new ListNode(k % 10);
		result = l;
		while (k / 10 != 0) {
			k = k / 10;
			l.next = new ListNode(k % 10);
			l = l.next;
		}

		return result;
	}

}
