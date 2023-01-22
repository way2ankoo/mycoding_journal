package BinaryTree;

public class BinaryTree1 {

	public void inorder(Node root) // Time complexity : O(n), Aux space : O(h) where h is height of a tree 
	{
		if(root!= null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public void preorder(Node root) // Time complexity : O(n), Aux space : O(h) where h is height of a tree
	{
		if(root!=null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void postorder(Node root) // Time complexity : O(n), Aux space : O(h) where h is height of a tree
	{
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		} 
	}
	
	public int heightOfTree(Node root) {
		if(root==null)
			return 0;
		else
			return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
	}
	
	public void printKDist(Node root, int k) // Time complexity : O(n), Aux space : O(h) where h is height of a tree
	{
		if(root==null)
			return;
		if(k==0)
			System.out.print(root.data + " ");
		else {
			printKDist(root.left, k-1);
			printKDist(root.right, k-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(70);
		
		BinaryTree1 tree = new BinaryTree1();
		System.out.print("In-order traversal : ");
		tree.inorder(root);
		System.out.println();
		System.out.print("Pre-order Traversal :  ");
		tree.preorder(root);
		System.out.println();
		System.out.print("Post-prder Traversal : ");
		tree.postorder(root);
		System.out.println();
		System.out.print("Height of the tree :  " + tree.heightOfTree(root));
		System.out.println();
		int k = 2;
		System.out.print("Elements at distance k : ");
		tree.printKDist(root, k);

	}

}
