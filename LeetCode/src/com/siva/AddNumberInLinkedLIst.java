package LeetCode;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class AddNumberInLinkedLIst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// add 2-->4-->3, 5-->6-->4 and return 7-->0-->8
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;

		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);
		ListNode l6 = new ListNode(4);
		l4.next = l5;
		l5.next = l6;

		ListNode l7 = new ListNode(9);
		ListNode l8 = new ListNode(9);
		l7.next = l8;
		ListNode l9 = new ListNode(1);
		ListNode l10 = new ListNode(5);
//		l9.next = l10;
		ListNode l = addTwoNumbers(l7, l9);
		while (l.next != null) {
			System.out.print(l.val + "--> ");
			l = l.next;
		}
		System.out.print(l.val);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1.val == 0) {
			return l2;
		}

		if (l2.val == 0) {
			return l1;
		}

		int value = l1.val + l2.val;
		boolean carryOver = false;
		if (value > 9) {
			value = value % 10;
			carryOver = true;
		}
		ListNode l = new ListNode(value);
		ListNode result = l;
		while (l1.next != null && l2.next != null) {
			l1 = l1.next;
			l2 = l2.next;
			value = l1.val + l2.val;
			if (carryOver) {
				value++;
				carryOver = false;
			}
			if (value > 9) {
				value = value % 10;
				carryOver = true;
			}
			l.next = new ListNode(value);
			l = l.next;
		}
		if (l1.next != null || l2.next != null) {
			if (l1.next != null) {
				l.next = l1.next;
				l = l.next;
			} else if (l2.next != null) {
				l.next = l2.next;
				l = l.next;
			}
			while (carryOver && l.next != null) {
				value = l.val;
				if (carryOver) {
					value++;
					carryOver = false;
				}
				if (value > 9) {
					value = value % 10;
					carryOver = true;
				}
				l.val = value;
				l = l.next;
			}
		}
		if (carryOver) {
			l.next = new ListNode(1);
		}
		return result;
	}
}
