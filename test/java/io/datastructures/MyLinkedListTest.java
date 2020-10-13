package io.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	public void newNodeAdded_shouldReturn_newNode() {
		
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);

		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		assertTrue(firstNode.getNext() == secondNode && secondNode.getNext() == thirdNode && thirdNode.getNext() == null);
		
	}
	

}
