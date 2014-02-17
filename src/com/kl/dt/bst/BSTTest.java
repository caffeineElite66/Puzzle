package com.kl.dt.bst;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BSTTest {
	
	@Test
	public void insertTest() {
		int N = 5;
		BST<Integer> bst = new BST<Integer>();
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			int value = rand.nextInt(100) + 1;
			bst.insert(value);
		}
		assertEquals(N, bst.size);
		BTreePrinter.printNode(bst.root);
		
	}

	@Test
	public void findTest() {
		fail("Not implemented yet.");
	}
	
	@Test
	public void deleteTest() {
		fail("Not implemented yet.");
	}

}
