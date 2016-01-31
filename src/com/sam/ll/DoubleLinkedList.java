package com.sam.ll;

public class DoubleLinkedList {
	
	//length
	public int ListLength(DLLNode headNode){
		int length = 0;
		DLLNode currentNode = headNode;
		while(currentNode!=null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	//insert a node
	public DLLNode dLLNodeInsert(DLLNode headNode, DLLNode nodeToInsert, int position){
		int size = ListLength(headNode);
		if(position>size+1 || position<1){
			System.out.println("Invalid");
			return headNode;
		}else {
			DLLNode previousNode = headNode;
			int count = 1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			DLLNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			if(currentNode != null)
				nodeToInsert.setNext(nodeToInsert);
				previousNode.setNext(nodeToInsert);
				nodeToInsert.setPrevious(previousNode);
				
		}
		
	return headNode;
	}
//delete
}
