package ctci.ch4;

public class BinarySearchTree {

	public static void main(String[] args) {
		Tree tree = null;
		
		BinarySearchTree bst = new BinarySearchTree();
		
		tree = bst.addNode(1,tree);
		tree = bst.addNode(2,tree);
		tree = bst.addNode(3,tree);
		tree = bst.addNode(4,tree);
		tree = bst.addNode(5,tree);
		tree = bst.addNode(6,tree);
		
		TreeCommonAlgos.printPostOrder(tree);

	}
	
	public Tree addNode(int item,Tree tree){
		if (tree == null){
			tree = new Tree(item, null, null);
		} else {
			if (item < tree.data){
				if (tree.left == null){
					tree.left = new Tree(item,null,null);
				} else {
					addNode(item,tree.left);
				}
			} else if (item > tree.data){
				if (tree.right == null){
					tree.right = new Tree(item,null,null);
				} else {
					addNode(item,tree.right);
				}
			}
		}
		return tree;
	}
	

}
