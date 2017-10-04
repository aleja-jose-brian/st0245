
public class Ejemplos 
{
    public static void main(String args[]){
        Arbol AO = new Arbol();
        Nodo raiz = new Nodo("Alejandra");
        AO.raiz=raiz;
        raiz.izq= new Nodo("John Jairo");
        raiz.der= new Nodo("Maria");
        raiz.izq.izq = new Nodo ("Ananias");
        raiz.izq.der = new Nodo ("Martha");
        raiz.der.izq = new Nodo ("Alvaro");
        raiz.der.der = new Nodo ("Adonai");
        AO.recursivePrint();
        }
}