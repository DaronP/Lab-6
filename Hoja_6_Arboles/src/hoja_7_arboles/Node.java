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
public class Node {
    int id; //numero que va a estar en el nodo, la key del mapa spanish y de english.
    Node right; // nodo hijo derecho
    Node left; //nodo hijo izquierdo
    
    public Node(int id){
        this.id = id;
    }
}
