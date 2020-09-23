package test.siva.alltests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.siva.tree.BinaryTree;
import com.siva.tree.BinaryTree.Node;

class TestBinayTree {

	public BinaryTree getTree() {
		BinaryTree bt = new BinaryTree();
		bt.addNode(50, "I'm 50");
		bt.addNode(35, "I'm 35");
		bt.addNode(70, "I'm 70");
		bt.addNode(65, "I'm 65");
		bt.addNode(60, "I'm 60");
		bt.addNode(150, "I'm 150");
		bt.addNode(15, "I'm 15");
		bt.addNode(25, "I'm 25");
		return bt;
	}

	@Test
	public void findNode() {
		BinaryTree bt = getTree();
		int key = 60;
		Node n = bt.findNode(key);
		assertNotNull(n);
		assertEquals(key, n.getKey());

		key = 1500;
		n = bt.findNode(key);
		assertNull(n);
	}

	@Test
	public void isTreeNotEmpty() {
		BinaryTree bt = getTree();
		assertNotNull(bt);
	}

	@Test
	public void isTreeEmpty() {
		BinaryTree bt = new BinaryTree();
		assertNotNull(bt);
		assertNull(bt.getRoot());
	}
}
