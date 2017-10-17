
public class GrafoMatriz
{
    public int [][] grafo;
    public int tamaño;
    public GrafoMatriz(int tamaño){
        grafo = new int[tamaño][tamaño];
        this.tamaño = tamaño;
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                grafo[i][j]  = 0;
            }
        }
    }
    public void insertar(int donde, int adonde, int distancia){
        if(grafo[donde][adonde] == 0){
            grafo[donde][adonde] = distancia; 
        }
    }
    public int getTamaño(){
        return tamaño;
    }
    public void borrar(int donde, int adonde){
        if(grafo[donde][adonde] != 0){
            grafo[donde][adonde] = 0;
        }
    }
    public void imprimir(){
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                System.out.print(grafo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        GrafoMatriz a = new GrafoMatriz(10);
        for(int k=1; k< a.getTamaño(); k++){
            a.insertar(k,2,4);
            a.insertar(k, a.getTamaño() - 3, 4);
        }
        for(int l = 3; l< a.getTamaño() - 3; l++){
            a.insertar(1, l, 4);
            a.insertar(5, l, 4);
        }
        a.imprimir();
    }
}
