/**
 * 
 */
package binarytree;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 5, 2019
 */
public class BinaryTreeTest {
	
	@Test
	public void testInsert() {
		BinaryTree<Integer> btree = new BinaryTree<Integer>(11, null, null); 
		System.out.println(btree);
		btree.insert(12);
		System.out.println(btree);
		btree.insert(10);
		System.out.println(btree);
		
	}

}
