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
	
	public INode<K> pop() {
		INode<K> poppedNode = head;
		head = head.getNext();
		return poppedNode;
	}
	
	/**
	 * UC 6 deleting last node
	 * 
	 * @return
	 */
	public INode<K> popLast() {
		INode<K> traverseNode = head;
		while (!traverseNode.getNext().equals(tail)) {
			traverseNode = traverseNode.getNext();
		}

		INode<K> tempNode = tail;
		tail = traverseNode;
		return tempNode;
	}
	
	/**
	 * UC 7 searching for element, returns node if present
	 * 
	 * @param integer
	 * @return
	 */
	public INode<K> search(Integer integer) {
		INode<K> temp = head;
		while (!temp.getNext().equals(null)) {
			if (temp.getKey().equals(integer))
				break;
			temp = temp.getNext();
		}
		return temp;
	}
	
	/**
	 * UC 8 inserting after element
	 * 
	 * @param integer
	 * @param newNode
	 */
	public void addAfterElement(Integer integer, INode<K> newNode) {
		INode<K> tempNode = search(integer);
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);
	}
}
