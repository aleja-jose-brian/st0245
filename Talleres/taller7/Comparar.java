
public class Comparar
{
    public static boolean comparar(Lista uno, Lista dos){
        Nodo a = uno.inicio;
        Nodo b = dos.inicio;
        String s1 = "";
        String s2 = "";
         while(a!=null){
             s1 = s1 + Integer.toString(a.data) + " ";
             a=a.siguiente;
         }
         while(b!=null){
             s2 = s2 + Integer.toString(b.data) + " ";
             b=b.siguiente;
         }
         return s1.equals(s2);
    }
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregar(5);
        lista.agregar(7);
        lista.agregar_al_inicio(0);
        
        Lista b = new Lista();
        System.out.print(comparar(lista, b));
    }
}
