public class Arbol
{
    public Nodo raiz;
    public Arbol(){
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
			System.out.println(nodo.dato);
		}
    }
    public void recursivePrint(){
		recursivePrintAUX(raiz);
	}
	private void printOrdenAUX(Nodo nodo){
	    if(nodo != null){
	        System.out.println(nodo.dato);
	        printOrdenAUX(nodo.izq);
	    }
    }
    public void printOrden(){
        printOrdenAUX(raiz);
    }
}
