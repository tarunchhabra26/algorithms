package ctci.ch4;

public class TreeCommonAlgos {

	public static void main(String[] args) {
		// Create a tree
		Tree left = new Tree(2, null, null);
		Tree right = new Tree(3, null, null);
		Tree root = new Tree(1, left, right);

		// Traverse the tree
		System.out.println("Pre order");
		printPreOrder(root);
		System.out.println("Post order");
		printPostOrder(root);
		System.out.println("In order");
		printInOrder(root);
	}

	public static void printPreOrder(Tree tree) {
		if (tree == null) {
			return;
		}
		System.out.println(tree.data + "");
		printPreOrder(tree.left);
		printPreOrder(tree.right);

	}

	public static void printPostOrder(Tree tree) {
		if (tree == null) {
			return;
		}
		printPreOrder(tree.left);
		printPreOrder(tree.right);
		System.out.println(tree.data + "");
	}

	public static void printInOrder(Tree tree) {
		if (tree == null) {
			return;
		}
		printPreOrder(tree.left);
		System.out.println(tree.data + "");
		printPreOrder(tree.right);

	}

}
