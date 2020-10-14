package com.DataStructure.StackQueue;

public class Stack_Queue<T> {
	LinkedList<T> linkedlist;

	public Stack_Queue() {
		this.linkedlist = new LinkedList<>();
	}
	public int size() {
		return linkedlist.size();
	}
	public boolean isEmpty() {
		return linkedlist.isEmpty();
	}
	public void printStack() {
		linkedlist.display();
	}

	public void push(INode<T> newNode) {
		linkedlist.append(newNode);
	}
	public INode<T> peak(){
		return linkedlist.head;
	}
	
	public INode<T> pop(){
		return linkedlist.popFirstElement();
	}
	
	public void popTillEmpty() {
		while(size()>=0) {
			System.out.println("\nPeaked Element: "+ peak().getData());
			System.out.println("Popped Element: "+pop().getData());
		}
		System.out.println("\nStack is empty.");
	}
	public static void main(String[] args) {
		Stack_Queue<Integer> stack = new Stack_Queue<Integer>();
		Node<Integer> newNode1 = new Node<Integer>(56);
		Node<Integer> newNode2 = new Node<Integer>(30);
		Node<Integer> newNode3 = new Node<Integer>(70);
		stack.push(newNode1);
		stack.push(newNode2);
		stack.push(newNode3);
		stack.printStack();
	}

}
