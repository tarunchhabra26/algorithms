package ctci.ch4.q3;

import ctci.ch4.Tree;

public class BinaryTreeFromArray {
	// 1) Get the Middle of the array and make it root.
	// 2) Recursively do same for left half and right half.
	// a) Get the middle of left half and make it left child of the root
	// created in step 1.
	// b) Get the middle of right half and make it right child of the
	// root created in step 1.

	public Tree generateTree(int[] input, int start, int end) {
		
		if (start > end)
			return null;

		int mid = start + (end - start) / 2; // To avoid overflow

		Tree treeNode = new Tree(input[mid], null, null);
		treeNode.left = generateTree(input, start, mid - 1);

		treeNode.right = generateTree(input, mid + 1, end);

		return treeNode;
	}
	
	void preOrderTraversal(Tree tree){
		if (null == tree)
			return;
		System.out.println(tree.data);
		preOrderTraversal(tree.left);
		preOrderTraversal(tree.right);			
	}
	
	public static void main(String args[]){
		int[] input = {1,2,3,4,5,6,7,8,9};
		
		Tree tree = new BinaryTreeFromArray().generateTree(input, 0, (input.length-1));
		
		new BinaryTreeFromArray().preOrderTraversal(tree);
	}
}
