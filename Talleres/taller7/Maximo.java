public class Maximo{
    public static int maximoAux(Nodo nodo, int max){
        if(nodo.siguiente == null) return max;
        if(nodo.data <= max) return maximoAux(nodo.siguiente, max);
        return maximoAux(nodo.siguiente, nodo.data);
    }
    
    public static int maximoAux(Nodo nodo){
        if(nodo == null) return 0;
        return maximoAux(nodo, nodo.data);
    }
    // busque el maximo #Recursivo
    // 
    public static void main(String []args){
        Lista a = new Lista();
        a.agregar(1);
        a.agregar(2);
        a.agregar(1);
        System.out.println(maximoAux(a.inicio));
        
    }
}