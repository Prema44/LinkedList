package io.datastructures;

public class MyLinkedList<K> {
	
	public INode<K> head ;
	public INode<K> tail ;
	
	MyLinkedList()
	{
		this.head = null;
		this.tail = null;		
	}
	
	public void add(INode<K> newNode) {
		
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
}
