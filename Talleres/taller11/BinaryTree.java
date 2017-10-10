public class BinaryTree {
  class Node {
    public Node left;
    public Node right;
    public int data;
    public  Node(int d){ 
      data = d;
   }
}

  private  boolean buscar(Node nodo, int n){
    if (nodo==null){
        return false;
    }if (nodo.data==n){
        return true;
    }if (n<nodo.data){
        return buscar(nodo.left, n);
    }
    return buscar(nodo.right, n);
  }
    private Node root=null;;
  public  boolean buscar(int n){
    return buscar(root, n);
  }
  
    public  Node Insertar(Node node, int n){
      Node nodo= new Node(n);
      if(root==null){
          return nodo;
        }
      if (nodo.data<n){
          Insertar(nodo.left,n);
        }
      if (nodo.data>n){
          Insertar(nodo.right,n);
        }
      return nodo;  
    }
     public   void Insertar(int n){
      root = Insertar(root, n);
     }
   
  public Node Borrar(Node nodu, int n){
     if (buscar(n)){
         nodu =null;
        }
        return nodu;
    }
  public void Borrar(int n){
      root= Borrar(root, n);    
     }

   
  public static void main(String args[]){
      BinaryTree tree1 = new BinaryTree();      
      tree1.Insertar(45);
      tree1.Insertar(6);
      tree1.Insertar(57);
      tree1.Insertar(15);
      tree1.Insertar(9);
      tree1.Borrar(6);
      
  }
}

