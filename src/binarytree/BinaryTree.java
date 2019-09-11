package binarytree;
/**
 * 
 */

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 5, 2019
 */

public class BinaryTree<E extends Comparable> {
	
	E value;
	BinaryTree<E> left;
	BinaryTree<E> right;
	
	public BinaryTree() {
		
	}
	public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right) {
		this.value=value;
		this.left=left;
		this.right=right;
		
	}
	
	public void insert(E toInsert) {
		if(toInsert.compareTo(value)<0) {
			if(null == this.left) {
				left = new BinaryTree<E>(toInsert, null, null);
			}else {
				left.insert(toInsert);
			}
		}else {
			if(null == this.right) {
				right = new BinaryTree<E>(toInsert, null, null);
			}else {
				right.insert(toInsert);
			}
		}
		
	}
	
	
}





