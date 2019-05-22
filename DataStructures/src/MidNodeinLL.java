
public class MidNodeinLL {

	public static void main(String[] args) {
		LLNode llnode = new LLNode(10);
		llnode.nextNode = new LLNode(15);
		getMidNodeValue(llnode);
	}

	public static int getMidNodeValue(LLNode firstNode) {
		LLNode node = firstNode;
		if (node == null) {
			return -1;
		}
		int size = 1;
		// to cal size of LL
		while (node.nextNode != null) {
			node = node.nextNode;
			size++;
		}

		int mid = size / 2;
		size = 1;
		while (firstNode.nextNode != null) {
			if (size == mid)
				return firstNode.value;
			size++;
		}
		return -1;
	}
}