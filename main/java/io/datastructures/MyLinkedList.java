package io.datastructures;

public class MyLinkedList<K> {
	
	public INode<K> head ;
	public INode<K> tail ;
	
	MyLinkedList()
	{
		this.head = null;
		this.tail = null;		
	}
	
	public void addAtHead(INode<K> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void addAtTail(INode<K> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void insert(INode<K> myNode, INode<K> newNode) {
		newNode.setNext(myNode.getNext());
		myNode.setNext(newNode);
	}
}
