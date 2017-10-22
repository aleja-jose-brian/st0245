/*
 * Codigo extraido de:
 * http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/
 */

class Node{
    int data;
    Node left;
    Node right;
    //Metodo Constructor, resive un entero
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}