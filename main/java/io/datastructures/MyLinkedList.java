package io.datastructures;

public class MyLinkedList<K extends Comparable <K>> {
	
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
	
	/**
	 * UC 9 deleting any element
	 * 
	 * @param integer
	 */
	public int delete(Integer integer) {
		INode<K> temp = head;
		INode<K> prev = head;
		if (head.getKey().equals(integer))
		{
			head = head.getNext();
		    return size();
		}
		else if(tail.getKey().equals(integer)) 
		{
			popLast();
			return size();
		}
		else {
			while (temp.getNext() != null) {
				if (temp.getKey().equals(integer))
					break;
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(temp.getNext());
			return size();
		}
	}

	/**
	 * UC 9 showing size of linked list
	 * 
	 * @return
	 */
	public int size() {
		INode<K> temp = head;
		int size = 0;
		while (temp.getNext() != null) {
			size++;
			temp = temp.getNext();
		}
		if(temp.equals(tail))
		{
			size++;
		}
		return size;
	}

	public void print() {
		INode<K> temp = head;
		while (temp.getNext() != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.print(temp.getKey());
		System.out.println();
	}
	
	/**
	 * UC 10 adding node in ascending order in linked list
	 * 
	 * @param newNode
	 * @return
	 */
	public boolean addInOrder(INode<K> newNode) {
		INode<K> temp = head;
		if (head == null) { 
			head = newNode;
			tail = newNode;
		} else if (head.getKey().compareTo(newNode.getKey()) > 0) { 
			newNode.setNext(temp);
			head = newNode;
		} else if (tail.getKey().compareTo(newNode.getKey()) < 0) { 
																	
			tail.setNext(newNode);
			tail = newNode;
		} else {
			INode<K> prev = head;
			while (temp.getNext() != null && temp.getKey().compareTo(newNode.getKey()) < 0) {
				prev = temp;
				temp = temp.getNext();
			}
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
		}
		return true;
	}

}
