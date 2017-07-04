package misc;

class BinarySearchTree{
	int value;
	BinarySearchTree right;
	BinarySearchTree left;
	
	public BinarySearchTree(){	
	}
	
	public BinarySearchTree(int value, BinarySearchTree left, BinarySearchTree right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
public class RangePrintBST {
	
	public void traverseTree(BinarySearchTree root, int min, int max){
		if (root == null)
			return;
		if (min < root.value ){
			traverseTree(root.left, min, max);
		}
		if (root.value >= min && root.value <= max)
		System.out.println(root.value);
		
		if (max > root.value){
			traverseTree(root.right, min, max);
		}
	}
	
	public BinarySearchTree createTree(){
		BinarySearchTree bst = new BinarySearchTree(2, null, null);
		BinarySearchTree bst1 = new BinarySearchTree(1, null, null);
		BinarySearchTree bst2 = new BinarySearchTree(3, null, null);
		BinarySearchTree bst3 = new BinarySearchTree(5, null, null);
		bst.left = bst1;
		bst.right = bst2;
		bst2.right = bst3;
		return bst;
	}
	
	public static void main(String args[]){
		RangePrintBST rp = new RangePrintBST();
		BinarySearchTree bst = rp.createTree();
		rp.traverseTree(bst,1, 2);
	}
	
	

}
