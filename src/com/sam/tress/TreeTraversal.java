package com.sam.tress;

public class TreeTraversal {
	//preorder(DLR):recursive
	public void preOrder(BinaryTreeNode root){
		System.out.println(root.getData());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	
}
