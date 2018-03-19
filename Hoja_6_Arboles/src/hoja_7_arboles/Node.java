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
    int id;
    String ingles;
    String espanol;
    Node right; // nodo hijo derecho
    Node left; //nodo hijo izquierdo
    
    public Node(int id, String ingles, String espanol){
        this.id = id;
        this.ingles = ingles;
        this.espanol = espanol;
    }
}
