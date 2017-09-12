
/**
 * Write a description of class Lista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lista
{
    Nodo inicio;
    public Lista(){
        inicio = null;
    }
    public void agregar(int n) {
        Nodo nuevo = new Nodo(n);
        if (inicio != null) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        } else {
            inicio = nuevo;
        }
    }
    
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
           System.out.print(temp.data+" "); 
           temp=temp.siguiente;
        }
    }
    
    public void agregar_al_inicio(int n) {
       Nodo m= new Nodo(n);
       m.siguiente=inicio;
       inicio=m;
        }
     public void imprimirInverso(){
         Nodo m = inicio;
         String s = "";
         while(m!=null){
             s = s + Integer.toString(m.data) + " ";
             m=m.siguiente;
         }
         for(int i = s.length(); i > 0; i--) System.out.print(s.charAt(i-1));
         System.out.println();
     }
        
     public void borrarFinal(){
        Nodo m = inicio;
        if(m.siguiente == null){
            inicio = null;
            return;
        }
        while(m.siguiente.siguiente != null){
          m=m.siguiente;
        }
        m.siguiente=null;
     }
        
     
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregar(5);
        lista.agregar(7);
        
        lista.agregar_al_inicio(0);
        lista.imprimir();
        lista.imprimirInverso();
        lista.borrarFinal();
        lista.imprimir();       
    }
    
}
