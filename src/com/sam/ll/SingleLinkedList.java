package com.sam.ll;

public class SingleLinkedList {
	public int ListLength(ListNode headNode){
		int length = 0;
		ListNode currentNode = headNode;
		while(currentNode!=null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	public ListNode insertInLinkedList(ListNode headNode, ListNode nodeToInsert, int position){
		if(headNode == null)
			return nodeToInsert;
		int size = ListLength(headNode);
		if(position>size+1 || position<1){
			System.out.println("Invalid");
			return headNode;
		}
		if(position == 1){
			nodeToInsert.setNext(headNode);
		}else{
			ListNode previousNode = headNode;
			int count = 1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			ListNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}
	
	//deleting a node
	public void deleteLinkedList(ListNode head){
		ListNode auxiliaryNode, iterator = head;
		while(iterator !=null){
			auxiliaryNode = iterator.getNext();
			iterator = null;
			iterator = auxiliaryNode;
		}
	}
	//find nth node
	public ListNode nthNodeFromEnd(ListNode head, int NthNode){
		ListNode pTemp = head, pNthNode = null;
		for(int count=1; count<NthNode;count++){
			if(pTemp != null){
				pTemp = pTemp.getNext();
			}
			while(pTemp!=null){
				if(pNthNode == null)
					pNthNode = head;
				else
					pNthNode = pNthNode.getNext();
				pTemp = pTemp.getNext();
			}
				return pNthNode;
		}
		return null;
	}
	//check if a ll is null terminated or ends in a loop
	public boolean DoesLLContainLoop(ListNode head){
		if(head == null){
			return false;
		}
		ListNode slowPtr = head, fastPtr = head;
		while(fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr){
				return true;
			}
		}
		return false;
	}
	
	//reverse linked list
	public ListNode reverseLL(ListNode head){
		ListNode temp = null;
		ListNode nextNode=null;
		while(head!=null){
			nextNode = head.getNext();
		head.setNext(temp);
		temp=head;
		head=nextNode;
		}
		return temp;
	}
	
}
