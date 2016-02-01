package com.sam.stacl;

import com.sam.ll.ListNode;

public class LLStack {
	private ListNode headNode;
	public LLStack(){
		this.headNode = new ListNode(0);// should make this null
	}
	public void push(int data){
		if(headNode == null){
			headNode = new ListNode(data);
		}else if(headNode.getData() == 0){
			headNode.setData(data);
		}else {
			ListNode listNode = new ListNode(data);
			listNode.setNext(headNode);
			headNode = listNode;
		}
	}
	public int top(){
		if(headNode == null)
			return 0;
		else return headNode.getData();
	}
	public void pop(){
		if(headNode == null)
			System.out.println("Invalid");
		else {
			headNode = headNode.getNext();
		}
	}
	public boolean isEmpty(){
		if(headNode == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void deleteStack(){
		headNode = null;
	}
}
