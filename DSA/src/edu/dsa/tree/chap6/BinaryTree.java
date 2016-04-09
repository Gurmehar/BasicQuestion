package edu.dsa.tree.chap6;

public class BinaryTree {

	public static void main(String[] args) {
		Node root= new Node(1,null,null);
		Node left = new Node(2, null, null);
		Node right = new Node(3, null, null);
		Node child1= new Node(4, null, null);
		Node child2= new Node(5, null, null);
		
		root.setLeftNode(left);
		root.setRightNode(right);
		
		left.setLeftNode(child1);
		left.setRightNode(child2);
		
		child1= new Node(6, null, null);
		child2= new Node(7, null, null);
		
		right.setLeftNode(child1);
		right.setRightNode(child2);
		
		/*PreOrder in= new PreOrder();
			in.recursiveInOrder(root);
			System.out.println("------------");
			in.nonrecursiveInOrder(root);*/
			/*PostOrder po = new PostOrder();
			po.nonrecursiveInOrder(root);
			po.recursiveInOrder(root);*/
				
			
			//System.out.println(new FindMax().findMaxRecursive(root));
			//System.out.println(new FindMax().findMax(root));
		//System.out.println(new FindElement().findElement(root,5));
		//System.out.println(new FindElement().findWithoutRecursion(root, 5));
		
		Node xtra= new Node(9, null, null);
		new InsertElement().addElement(root, xtra);
		//new LevelOrderTraversal().traverse(root);
		//System.out.println(new SizeBinaryTree().sizeOfTreeRecursive(root));
		//System.out.println(new SizeBinaryTree().sizeOfTree(root));
		//new DeleteBinaryTree().deleteTree(root);
		new PrintReverseBT().printReverBT(root);
		
	}
	
}
