package com.DataStructure.StackQueue;

public interface INode<T> {
	T getData();
	void setData(T data);
	
	INode<T> getNext();
	void setNext(INode<T> next);
}
