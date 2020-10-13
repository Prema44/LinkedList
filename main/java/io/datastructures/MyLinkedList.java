package io.datastructures;

public class MyLinkedList<K> {
	
	private INode<K> head ;
	private INode<K> tail ;
	
	MyLinkedList()
	{
		this.head = null;
		this.tail = null;		
	}
	
	public void add(INode<K> newNode) {	
		this.head = newNode;
		this.tail = newNode;
	
	}
	
	

}
