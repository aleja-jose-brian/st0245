public class PuntoUno
{
    private int [] tabla;
    public PuntoUno(){
        tabla = new int [10];
    }
    private int funcionHash(String s){
        return ((int) s.charAt(0))%10;
    }
    public int get(String s){
         return tabla[funcionHash(s)];
    }
    public void put(String s, int v){
        tabla[funcionHash(s)] = v ;
    }
}
    

