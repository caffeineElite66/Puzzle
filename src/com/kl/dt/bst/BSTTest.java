package com.kl.dt.bst;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class BSTTest {
	
	int ELEMENT_COUNT;
	int searchValue;
	BST bst;
	
	@Before
	public void setUp() {
		this.ELEMENT_COUNT = 10;
		bst = new BST<Integer>();
		bst.insert(10);bst.insert(5);bst.insert(6);bst.insert(3);bst.insert(2);
		bst.insert(11);bst.insert(25);bst.insert(7);bst.insert(13);bst.insert(15);
	}
	
	@Test
	public void insertTest() {
		BST bst = new BST();
		Random random = new Random();
		for (int i = 0; i < ELEMENT_COUNT; i++) {
			int data = random.nextInt(10) + 1;
			bst.insert(data);
		}
		BTreePrinter.printNode(bst.root);
		assertEquals(ELEMENT_COUNT, bst.size);
	}

	@Test
	public void findTest() {
		Node node = bst.find(25);
		System.out.println("Current note is: " + node.data);
		assertEquals(25, node.data);
	}
	
	@Test
	public void deleteTest() {
		Node node = bst.delete(25);
		assertEquals(25, node.data);
		assertEquals(ELEMENT_COUNT - 1, bst.size);
	}

}
