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
    
    
    public void insertNode(int id, String ingles, String espanol){
        Node newNode = new Node(id, ingles, espanol);
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
    
    public void findNode(){
        
    }
   
}