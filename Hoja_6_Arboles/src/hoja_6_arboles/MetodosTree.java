package hoja_6_arboles;

public class MetodosTree{
    
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
                    
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else{
                    focusNode = focusNode.rightChild;
                    
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
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
    
    public Node findNode(int key){
        Node focusNode = root;
        
        while(focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftChild;
                
            }
            else{
                focusNode = focusNode.rightChild;
            }
            
            if(focusNode == null){
                return null;
            }
        }
        return focusNode;
    }

}