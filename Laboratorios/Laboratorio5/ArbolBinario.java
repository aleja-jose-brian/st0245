
public class ArbolBinario
{
    public Nodo raiz;
    public ArbolBinario(){
        raiz = null;
    }

    private int max2(int i, int j){
        if(i>j){
            return i;
        }
        return j;
    }

    private int maxheightAUX(Nodo nodo){
        if(raiz == null){
            return 0;
        }
        return max2(maxheightAUX(nodo.izq), maxheightAUX(nodo.der)) + 1;
    }

    public int maxheight(){
        return maxheightAUX(raiz);
    }

    private void recursivePrintAUX(Nodo nodo){
        if (nodo != null){
            recursivePrintAUX(nodo.izq);
            recursivePrintAUX(nodo.der);
            System.out.println(nodo.data);
        }
    }

    public void recursivePrint(){
        recursivePrintAUX(raiz);
    }

    public boolean buscar(String name){
        Nodo adoptiva = raiz;
        while(adoptiva != null){
            if(adoptiva.data.equals(name)){
                return true;
            }
            adoptiva = adoptiva.izq;
        } 
        while(adoptiva != null){
            if(adoptiva.data.equals(name)){
                return true;
            }
            adoptiva = adoptiva.der;
        } 
        return false;
    }

    public int altura(){
        Nodo adoptivo = raiz;
        int contador = 0;
        while(adoptivo != null){
            contador ++;
            adoptivo = adoptivo.der;
        }
        return contador;
    }

    private int tamañoAux(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return n + tamañoAux(n-1) + tamañoAux(n-2);
    }

    public int tamaño(){
        return tamañoAux(altura());
    }

    public String getGrandMothersName(){
        if(raiz.izq.izq != null){
            return raiz.izq.izq.data;
        }
        return null;
    }

    public static void main (String [] args){
        //Familia de Alejandra
        Nodo hija = new Nodo("Alejandra");
        hija.izq = new Nodo ("Maria"); hija.der = new Nodo ("John Jairo");
        hija.izq.izq = new Nodo ("Adelina"); hija.izq.der = new Nodo("Alvaro"); hija.der.izq = new Nodo ("Martha"); hija.der.der = new Nodo("Ananias");

        //Arbol Genealogico Ossa-Yepes
        ArbolBinario ossaYepes = new ArbolBinario();
        ossaYepes.raiz = hija;
        ossaYepes.recursivePrint();

        System.out.println(ossaYepes.buscar("Maria"));
        System.out.println(ossaYepes.buscar("Fernando"));

        System.out.println("Altura: "+ossaYepes.altura());

        System.out.println("Tamaño: "+ossaYepes.tamaño());
        
        System.out.println();
        
        //Familia de Wilkenson
        Nodo hijo = new Nodo("Wilkenson");
        hijo.izq = new Nodo("Joaquina"); hijo.der = new Nodo("Sufranio");
        hijo.izq.izq = new Nodo("Eustaquia"); hijo.izq.der = new Nodo ("Eustaquio"); hijo.der.izq = new Nodo ("Piolina"); hijo.der.der = new Nodo("Piolin");
        hijo.izq.izq.izq = new Nodo("Florinda"); hijo.izq.izq.der = new Nodo (null); hijo.izq.der.izq = new Nodo (null); hijo.izq.der.der = new Nodo("Jovin"); hijo.der.izq.izq = new Nodo ("Wilberta"); hijo.der.izq.der = new Nodo(null); hijo.der.der.izq = new Nodo(null); hijo.der.der.der = new Nodo("Usnavy");
        
        ArbolBinario wilk = new ArbolBinario();
        wilk.raiz = hijo;
        
        wilk.recursivePrint();
        
    }

}
