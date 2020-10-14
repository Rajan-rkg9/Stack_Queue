package com.DataStructure.StackQueue;

public class Stack_Queue<T> {
	LinkedList<T> linkedlist;

	public Stack_Queue() {
		this.linkedlist = new LinkedList<>();
	}
	public int size() {
		return linkedlist.size();
	}

	public void printStack() {
		linkedlist.display();
	}

	public void push(INode<T> newNode) {
		linkedlist.insert(newNode);
	}

	public static void main(String[] args) {
		Stack_Queue<Integer> stack = new Stack_Queue<Integer>();
		Node<Integer> node1 = new Node<Integer>(56);
		Node<Integer> node2 = new Node<Integer>(30);
		Node<Integer> node3 = new Node<Integer>(70);
		stack.push(node3);
		stack.push(node2);
		stack.push(node1);
		stack.printStack();
	}

}
