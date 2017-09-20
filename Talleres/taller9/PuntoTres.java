import java.util.Hashtable;
import java.util.Enumeration;
public class PuntoTres
{    
    static  Hashtable<String, String> arepa = new Hashtable<String, String>();
    public static void empresa(String a, String b){
        arepa.put(a,b);
        System.out.println(a+ " → " + b);
    }
    public static void buscarPais(String a){
        System.out.println(arepa.get(a));
    }
    public static void buscarEmpresa(String a){
        Enumeration<String> llaves = arepa.keys();
        while(llaves.hasMoreElements()){
            if(arepa.get(llaves.nextElement())==a){
                System.out.println(llaves.nextElement());
            }
        }
    }
    public static void main(String[] args){
        empresa("Google","Estados Unidos");
        empresa("La Locura","Colombia");
        empresa("Nokia","Finlandia");
        empresa("Sony","Japon");       
        buscarPais("Nokia");
        buscarPais("Alejandra");
        buscarEmpresa("Colombia");
    }
}

