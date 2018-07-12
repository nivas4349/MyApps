package com.siva.map;

import java.util.HashMap;

public class LRUWithHashMapDoubleLL {

	final int capacity;
	int currentSize = 0;
	Node mru, lru;

	HashMap<Integer, Node> cache = new HashMap<>();

	public LRUWithHashMapDoubleLL(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		Node tempNode = cache.get(key);
		if (tempNode == null) {
			System.out.println(-1);
			return -1;
		}

		if (tempNode == mru) {
		} else if (tempNode == lru) {
			lru = tempNode.next;
			lru.prev = null;
			tempNode.prev = mru;
			mru.next = tempNode;
			tempNode.next = null;
			mru = tempNode;
		} else {
			Node p = tempNode.prev;
			Node n = tempNode.next;

			p.next = n;
			n.prev = p;

			mru.next = tempNode;
			tempNode.prev = mru;
			tempNode.next = null;
			mru = tempNode;
		}

		System.out.println(tempNode.value);
		return tempNode.value;
	}

	public void put(int key, int value) {
		if (get(key) != -1) {
			cache.get(key).value = value;
			return;
		}
		Node newNode = new Node(null, null, key, value);
		if (currentSize == 0) {
			cache.put(key, newNode);
			mru = newNode;
			lru = newNode;
			currentSize++;
		} else {
			if (currentSize < capacity) {
				cache.put(key, newNode);
				currentSize++;
			} else {
				cache.remove(lru.key);
				cache.put(key, newNode);
				lru = lru.next;
				lru.prev = null;
			}
			newNode.prev = mru;
			mru.next = newNode;
			mru = newNode;
		}
	}

	class Node {
		int key;
		int value;

		Node prev, next;

		public Node(Node prev, Node next, int key, int value) {
			this.prev = prev;
			this.next = next;
			this.key = key;
			this.value = value;
		}

		public String toString() {
			return String.valueOf(value);
		}
	}

	public static void main(String[] args) {
		LRUWithHashMapDoubleLL obj = new LRUWithHashMapDoubleLL(3);
		obj.put(1, 1);
		obj.put(2, 2);
		obj.get(3);
		obj.get(1);
		obj.put(3, 3);
		obj.printItems(8);
		obj.put(4, 4);
		obj.get(2);
		obj.get(1);
		obj.put(5, 5);
		obj.get(3);
		obj.get(4);
		obj.put(6, 6);
		obj.put(7, 7);
		obj.get(5);
		obj.printItems(8);
		obj.put(4, 44);
		obj.put(9, 900);
		obj.get(6);
		obj.printItems(8);
	}

	public static void printItems(LRUWithHashMapDoubleLL obj, int len) {
		System.out.println("=================");
		for (int i = 1; i < len; i++) {
			System.out.println(obj.get(i));
		}
		System.out.println("=================");
	}

	public void printItems(int len) {
		System.out.println("=================");
		for (int i = 1; i <= len + 1; i++) {
			System.out.println(cache.get(i));
		}
		System.out.println("=================");
	}

}
