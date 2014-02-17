package com.kl.dt.bst;

public class Node<T extends Comparable<?>> {
	public T data;
	public Node left;
	public Node right;
	
	public Node(T data) {
		this.data = data;
	}
}
