/**
 * LRU - Least Recently Used algorithm implementation using LinkedHashMap
 */

package com.siva.map;

import java.util.LinkedHashMap;
import java.util.Map;

import com.sun.scenario.effect.impl.prism.PrImage;

public class LRUWithLinkedHashMap {

	private final int CAPACITY;
	private LinkedHashMap<Integer, Integer> map;

	public LRUWithLinkedHashMap(int capacity) {
		CAPACITY = capacity;
		map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
			private static final long serialVersionUID = 1L;

			public boolean removeEldestEntry(Map.Entry me) {
				return size() > CAPACITY;
			}
		};
	}

	public int get(int key) {
		int res = map.getOrDefault(key, -1);
		System.out.println(res);
		return res;
	}

	public void set(int key, int value) {
		map.put(key, value);
	}

	public static void main(String[] args) {
		LRUWithLinkedHashMap lru = new LRUWithLinkedHashMap(3);
		lru.set(1, 1);
		lru.set(2, 2);
		lru.get(3);
		lru.get(1);
		lru.set(3, 3);
		lru.set(4, 4);
		lru.get(2);
		lru.get(1);
		lru.set(5, 5);
		lru.get(3);
		lru.get(4);
		lru.set(6, 6);
		lru.set(7, 7);
		lru.get(5);
		printItems(lru, 8);
		lru.set(4, 44);
		lru.set(9, 900);
		lru.get(6);
		printItems(lru, 10);
	}

	public static void printItems(LRUWithLinkedHashMap lru, int len) {
		System.out.println("=================");
		for (int i = 1; i < len; i++) {
			lru.get(i);
		}
		System.out.println("=================");
	}
}
