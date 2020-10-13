package io.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	public void whenAddAtHeadMethodCalled_shouldAdd_AtHead() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtHead(firstNode);
		myLinkedList.addAtHead(secondNode);
		myLinkedList.addAtHead(thirdNode);
		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				         && myLinkedList.tail.equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void whenAddAtTailMethodCalled_shouldAdd_AtTail() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtTail(firstNode);
		myLinkedList.addAtTail(secondNode);
		myLinkedList.addAtTail(thirdNode);
		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				         && myLinkedList.tail.equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void insertMethod_shouldInsert_betweenTwoNodes() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtTail(firstNode);
		myLinkedList.addAtTail(thirdNode);
		myLinkedList.insert(firstNode, secondNode);
		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				         && myLinkedList.tail.equals(thirdNode);
		assertTrue(result);
	}
	
	@Test
	public void popMethod_shouldPop_firstNode() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtTail(firstNode);
		myLinkedList.addAtTail(secondNode);
		myLinkedList.addAtTail(thirdNode);
		assertEquals(firstNode, myLinkedList.pop());
	}
	
	@Test
	public void popLastMethod_shouldPop_lastNode() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtTail(firstNode);
		myLinkedList.addAtTail(secondNode);
		myLinkedList.addAtTail(thirdNode);
		assertEquals(thirdNode, myLinkedList.popLast());
	}
	
	@Test
	public void searchMethod_shouldReturnNode_ifPresent() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtTail(firstNode);
		myLinkedList.addAtTail(secondNode);
		myLinkedList.addAtTail(thirdNode);
		assertEquals(secondNode, myLinkedList.search(30));
	}
	
	@Test
	public void whenAddAfterElementMethodCalled_shouldAdd_afterGivenElement() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyNode<Integer> fourthNode = new MyNode<>(40);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtTail(firstNode);
		myLinkedList.addAtTail(secondNode);
		myLinkedList.addAtTail(thirdNode);
		myLinkedList.addAfterElement(30, fourthNode);
		boolean result = secondNode.getNext().equals(fourthNode);
		assertTrue(result);
		
		
	}
	
	@Test
	public void whenMethodsCalled_shouldDeleteAndShowSize() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(40);
		MyNode<Integer> fourthNode = new MyNode<>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addAtTail(firstNode);
		myLinkedList.addAtTail(secondNode);
		myLinkedList.addAtTail(thirdNode);
		myLinkedList.addAtTail(fourthNode);
		System.out.println("Linked List before deleting : ");
		myLinkedList.print();
		int size = myLinkedList.delete(40);
		System.out.println("Linked List after deleting 40 : ");
		myLinkedList.print();
		assertEquals(3, size);
	}
	
	@Test
	public void whenAddInOrderCalled_shouldAddInAscendingOrder() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(40);
		MyNode<Integer> fourthNode = new MyNode<>(70);
		MyNode<Integer> fifthNode = new MyNode<>(58);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		assertTrue(myLinkedList.addInOrder(firstNode));
		assertTrue(myLinkedList.addInOrder(secondNode));
		assertTrue(myLinkedList.addInOrder(thirdNode));
		assertTrue(myLinkedList.addInOrder(fourthNode));
		assertTrue(myLinkedList.addInOrder(fifthNode));
		System.out.println("Linked List after adding in order : ");
		myLinkedList.print();
	}

}
