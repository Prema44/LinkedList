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

}
