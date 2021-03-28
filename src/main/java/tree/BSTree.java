package tree;

import java.io.IOException;

import com.testMasivian.Apuestas.model.Cliente;

public class BSTree {

	  /* ********************************************** *
	   * CLASS BSNode * **********************************************
	   */

	  static class BSNode {

	    private Comparable key;
	    private Object info;
	    private BSNode left;
	    private BSNode right;

	    BSNode(Comparable key, Object info) {
	      this(key, info, null, null);
	    }

	    BSNode(Comparable key, Object info, BSNode l, BSNode r) {
	      this.key = key;
	      this.info = info;
	      left = l;
	      right = r;

	    }

	    Comparable getKey() {
	      return key;
	    }

	    Object getInfo() {
	      return info;
	    }

	    BSNode getLeft() {
	      return left;
	    }

	    BSNode getRight() {
	      return right;
	    }

	    void setInfo(Cliente info) {
	      this.info = info;
	    }

	    void setLeft(BSNode left) {
	      this.left = left;
	    }

	    void setRight(BSNode right) {
	      this.right = right;
	    }

	    public void insert(BSNode tree) throws IOException {

	      if (tree.getKey().compareTo(this.getKey()) < 0) {
	        // lower key -> insert in the left subtree
	        if (left != null)
	          left.insert(tree);
	        else
	          left = tree;

	      } else if (tree.getKey().compareTo(this.getKey()) > 0) {
	        // greater key -> right subtree
	        if (right != null)
	          right.insert(tree);
	        else
	          right = tree;

	      } else
	    	this.setInfo((Cliente) tree.getInfo());
	        //throw new IOException("Elment already in tree");

	    }

	    /**
	     * Returns the object stored in the node whose key is the same as the one of
	     * the key param.
	     * 
	     * @param key
	     *          string to search
	     * @return object stored in the searched node
	     */
	    public Object search(BSNode tree) {

	      Object result = null;

	      if (tree.getKey().compareTo(this.getKey()) == 0)
	        result = this.getInfo();

	      else if (tree.getKey().compareTo(this.getKey()) < 0) {
	        // If the key to search is lower than the one
	        // of the root, search down through the left subtree
	        if (left != null)
	          result = left.search(tree);

	      }

	      else {
	        // greater key -> right subtree
	        if (right != null)
	          result = right.search(tree);

	      }

	      return result;
	    }

	    void preOrder() {
	      System.out.println(info);
	      if (left != null)
	        left.preOrder();
	      if (right != null)
	        right.preOrder();
	    }

	    void inOrder() {
	      if (left != null)
	        left.inOrder();
	      System.out.println(info);
	      if (right != null)
	        right.inOrder();
	    }

	    void postOrder() {
	      if (left != null)
	        left.postOrder();
	      if (right != null)
	        right.postOrder();
	      System.out.println(info);
	    }
	  }
	  
	  /* ********************************************** */

	  public static final int LEFT_SIDE = 0;
	  public static final int RIGHT_SIDE = 1;

	  protected BSNode root;

	  public BSTree() {
	    root = null;
	  }

	  BSTree(Comparable key, Object info) {
	    root = new BSNode(key, info);
	  }

	  public BSNode getRoot() {
	    return root;
	  }

	  public void setRoot(BSNode root) {
	    this.root = root;
	  }

	  public void insert(Comparable key, Object info) {

	    BSNode node = new BSNode(key, info);

	    if (root == null)
	      setRoot(node);
	    else {
	      try {
	        root.insert(node);
	      } catch (IOException e) {
	        System.out.println(e);
	      }

	    }

	  }

	  public Object search(String info) {

	    BSNode node = new BSNode(info, info);

	    return root.search(node);

	  }

	  /**
	   * Check if the tree is empty (no nodes)
	   * 
	   * @return true if tree is empty; false otherwise
	   */
	  boolean isEmpty() {
	    return (root == null);

	  }

	  public void printPreOrder() {
	    if (root != null)
	      root.preOrder();
	  }

	  public void printInOrder() {
	    if (root != null)
	      root.inOrder();
	  }

	  public void printPostOrder() {
	    if (root != null)
	      root.postOrder();
	  }

	}