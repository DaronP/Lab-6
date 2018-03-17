/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_6_arboles;

/**
 * 
 * @author Andres
 * @author Antonio
 */
public class BinaryTree {
    
    Node root;
    
    public void addNode(String param){
        Node newNode = Node(param);
        
        if(root == null){
            root = newNode;
        }
        else{
            Node focusNode = root;
            Node parent;
            
            while(true){
                parent = focusNode;
                
                if(param){
                    focusNode = focusNode.leftChild;
                }
            }
        }
        
    }
    
    public void inOrder(Node nodo){
        if(nodo != null){
            inOrder(nodo.leftChild);
            System.out.println(nodo);
            inOrder(nodo.rightChild);
        }
    }
    
}
