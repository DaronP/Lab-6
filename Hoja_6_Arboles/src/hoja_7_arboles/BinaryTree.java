/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_7_arboles;

/**
 * 
 * @author Andres
 * @author Antonio
 */
public class BinaryTree<E>
{
    Node raiz; //raiz del arbol
    
    public BinaryTree(){
        raiz = null;
    }
    
    
    public void insertNode(int id){
        Node newNode = new Node(id);
        if (raiz == null) //en el casode que la razi no posea 
        {
            
            raiz = newNode;
            
        }else{
            Node focusNode = raiz;
            
            Node parent;
            
            while(true){
                
                parent = focusNode;
                
                if(id < focusNode.id)//si el numero es menor al focusNode (que simboliza una raiz), se cambia el enfoque al lado izquierdo
                {
                    focusNode = focusNode.left;
                    
                    if(focusNode == null)//si el valor que regresa es null, significa que este nodo aun no existe. es un lugar donde puede colocarse el nuevo nodo
                    {
                        parent.left = newNode; //se establece el nodo.
                        return ;//finaliza la ejecucion
                    }
                    
                } else  // en el caso de que el numero sea mayor a FocusNode (raiz), se cambia el enfoque al lado derecho.
                {
                    focusNode = focusNode.right;
                    
                    if(focusNode == null)// si el valor que regresa es nul, significa que este nodo aun no exite. Es un lugar donde puede colocarse el nuevo nodo.
                    {
                        parent.right = newNode;
                        return; //finaliza la ejecucion
                    }
                }
            }
        }
    }
    /*
    protected E val; // value associated with node
	protected BinaryTree<E> parent; // parent of node
	protected BinaryTree<E> left, right; // children of node
	
	public BinaryTree()
	// post: constructor that generates an empty node
	{
		val = null;
		parent = null; left = right = this;
	}
	
	public BinaryTree(E value)
	// post: returns a tree referencing value and two empty subtrees
	{
		val = value;
		right = left = new BinaryTree<E>();
		setLeft(left);
		setRight(right);
	}
	
	public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right)
	// post: returns a tree referencing value and two subtrees
	{
		val = value;
		if (left == null) { left = new BinaryTree<E>(); }
		setLeft(left);
		if (right == null) { right = new BinaryTree<E>(); }
		setRight(right);
	}
	
	public BinaryTree<E> left()
	// post: returns reference to (possibly empty) left subtree
	// post: returns reference to (possibly empty) left subtree
	{
		return left;
	}
	
	public BinaryTree<E> parent()
	// post: returns reference to parent node, or null
	
	public void setLeft(BinaryTree<E> newLeft)
	// post: sets left subtree to newLeft
	// re-parents newLeft if not null
	{
		if (isEmpty()) return;
		if (left != null && left.parent() == this) left.setParent(null);
		left = newLeft;
		left.setParent(this);
	}
	
	protected void setParent(BinaryTree<E> newParent)
	// post: re-parents this node to parent reference, or null
	{
		if (!isEmpty()) {
		parent = newParent;
		}
	}
	
	public Iterator<E> iterator()
	// post: returns an in-order iterator of the elements
	
	public boolean isLeftChild()
	// post: returns true if this is a left child of parent
	
	public E value()
	// post: returns value associated with this node
	{
		return val;
	}
	
	public void setValue(E value)
	// post: sets the value associated with this node
	{
		val = value;
	}
	
        */
}