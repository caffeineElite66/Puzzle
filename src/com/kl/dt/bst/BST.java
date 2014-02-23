package com.kl.dt.bst;

import static org.junit.Assert.*;

import org.junit.Test;


public class BST <T extends Comparable<?>> {
	
	public Node root;
	public int size;
	public int height;
	
	public void BST() {
		root = null;
		size = 0;
		height = 0;
	}
	
	
	/**
	 * Insert node methods
	 * @param node
	 */
	public void insert(T data) {
		if (root == null) {
			root = new Node(data);
			size = 1;
			height = 1;
		} else {
			insert(root, data);
		}
	}
	
	private void insert(Node currentNode, T key) {
		
		if (currentNode.data.compareTo(key) > 0) { // go to left
			if (currentNode.left == null)  {
				currentNode.left = new Node(key); 
				size++; height++;
			}
			else { 
				insert(currentNode.left, key);
			}
		} else { // go to right
			if (currentNode.right == null) {
				currentNode.right = new Node(key);
				size++; height++;
			} else {
				insert(currentNode.right, key);
			}
		}
	}
	
	public Node delete(T data) {
		return delete(this.root, data);
	}
	
	private Node delete(Node node, T data) {
		if (node.data.compareTo(data) < 0) {
			return delete(node, data);
		} else if (node.data.compareTo(data) > 0) {
			return delete(node, data);
		} else {
			return node;
		}
	}
	
	
	public Node find(T data) {
		return find(root, data);
	}	
	
	private Node find(Node node, T data) {
		
		if (node.data.compareTo(data) > 0) {
			return find(node.left, data);
		} else if (node.data.compareTo(data) < 0) {
			return find(node.right, data);
		} 
		return node;
	}

}
