package BinaryTree;

public class TreeNode {
	/**
	 * 二叉树的树节点数据结构
	 * @author issac
	 *
	 */
		private String key;
		private TreeNode leftchild;
		private TreeNode rightchild;
		
		public TreeNode(String key){//构造方法
			this.key = key;
			this.leftchild = null;
			this.rightchild = null;
		}
		
		public TreeNode(String key,TreeNode leftchild,TreeNode rightchild){//构造方法
			this.key = key;
			this.leftchild = leftchild;
			this.rightchild = rightchild;
		}
		
		public String getKey(){
			return key;
		}
		public void setKey(String key){
			this.key = key;
		}
		public TreeNode getLeftChild(){
			return leftchild;
		}
		public void setLeftChild(TreeNode leftchild){
			this.leftchild = leftchild;
		}
		public TreeNode getRightChild(){
			return rightchild;
		}
		public void setRightChild(TreeNode rightchild){
			this.rightchild = rightchild;
		}
	

}
