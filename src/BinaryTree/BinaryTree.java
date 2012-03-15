package BinaryTree;

import java.util.LinkedList;

public class BinaryTree {
	private TreeNode root;
	
	public BinaryTree(){
		root = null;
	}
	
	public void setBinaryTree(TreeNode root){
		this.root = root;
	}
	public TreeNode getBinaryTree(){
		return root;
	}
	
	public static TreeNode createBinaryTree(String[] array){
		LinkedList <TreeNode> nodeList = new LinkedList<TreeNode>();
		/**
		 * �����������ȫ��ת��Ϊ����Ҫ�����ڵ����ݽṹ��ʽ
		 * ���������ʽ���洢���еĽڵ�
		 * @param nodeList
		 */
		for(int nodeIndex = 0; nodeIndex<array.length;nodeIndex++)
			nodeList.add(new TreeNode(array[nodeIndex]));
		/**
		 * ����ڵ�֮��ĸ��ӹ�ϵ�����һ���ڵ㵥�������ж��Ƿ����ֻ��һ�����ӽڵ�����
		 */
		for(int parentIndex = 0; parentIndex<array.length/2-1;parentIndex++){
			nodeList.get(parentIndex).setLeftChild(nodeList.get(parentIndex*2+1));
			nodeList.get(parentIndex).setRightChild(nodeList.get(parentIndex*2+2));
		}
		int lastParentIndex = array.length/2-1;
		nodeList.get(lastParentIndex).setLeftChild(nodeList.get(lastParentIndex*2+1));
		if(array.length%2 == 1){
			nodeList.get(lastParentIndex).setRightChild(nodeList.get(lastParentIndex*2+2));
		}
		TreeNode root = nodeList.get(0);
		BinaryTree binTree = new BinaryTree();
		binTree.setBinaryTree(root);
		return root;
//		System.out.println(nodeList.get(7).getKey());
//		System.out.println(nodeList.get(6).getLeftChild().getKey());
	}
	
	/**
	 * �������ı������ݹ��㷨��
	 * @param TreeNode
	 */
	public static void preOrderTraverse(TreeNode root){//�������
		if(root != null){
			Visit(root);
			preOrderTraverse(root.getLeftChild());
			preOrderTraverse(root.getRightChild());
		}
			
	}
	
	public static void inOrderTraverse(TreeNode root){//�������
		if(root!=null){
		inOrderTraverse(root.getLeftChild());
		Visit(root);
		inOrderTraverse(root.getRightChild());
		}
	}
	
	public static void postOrderTraverse(TreeNode root){//��������
		if(root!=null){
		postOrderTraverse(root.getLeftChild());
		postOrderTraverse(root.getRightChild());
		Visit(root);
		}
	}
	
	/**
	 * �������ı������ǵݹ��㷨��
	 * @param TreeNode
	 */
	public static void preOrderTraverse2(TreeNode root){
		
	}
	
	/**
	 * ���Ժ���
	 */
	
	public static void Visit(TreeNode node){
		System.out.print(node.getKey() + "   ");
	}
	
	public static void main(String[] args){
		String[] array = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13"};
		TreeNode root = createBinaryTree(array);
		System.out.println(root.getKey());
		System.out.println(root.getLeftChild().getKey());
		System.out.println(root.getRightChild().getKey());
		
		preOrderTraverse(root);
		System.out.println("");
		inOrderTraverse(root);
		System.out.println("");
		postOrderTraverse(root);
	}
	
}
