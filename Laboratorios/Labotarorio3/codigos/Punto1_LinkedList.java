import java.util.LinkedList;
public class Punto1_LinkedList
{
    //Ejercicio 1
    /**
	 * @param  este metodo resive un LinkedList (linked)
	 * @see esta implementado un metodo size y un get
	 */
    public static int multiplicacion(LinkedList<Integer> linked){
        int mult = 1;
        for(int i = 0; i < linked.size(); i++){
            mult *= linked.get(i);
        }
        return mult;
    }
    
    //Ejercicio 2
    /**
	 * @param  este metodo resive un LinkedList (linked) y un entero date
	 * @see implementa un get y un add 
	 */
    public static void SmartIncert(LinkedList<Integer> linked, int data){
        int igual = 0;
        for(int i = 0; i<linked.size(); i++){
            if(linked.get(i) == data){
                igual ++;
            }
        }
        if(igual == 0){
            linked.add(data);
        } 
    }
    
    //Ejercicio 3
    /**
	 * @param  este metodo resive inkedList (linked)
	 */
    public static int pivote(LinkedList<Integer> linked){
        int[] sum = suma(linked);
        int last = sum[sum.length-1];
        int n = 0;
        int pivot = 0;
        int min = last + 1;
        for(int i = 1; i < sum.length; i++){
            int x = Math.abs(sum[i-1] - (last - sum[i]));
            if(x < min){
                min = x;
                pivot = i;
            }
        }
        return pivot - 1;
    }
    private static int[] suma(LinkedList<Integer> linked){
        int sum = 0;      
        int[] suma = new int[linked.size() + 1];
        suma[0] = 0;
        for(int i=0; i< linked.size(); i++){            
            sum += linked.get(i);
            suma[i + 1] = sum;
        }
        return suma;
    }
    //Ejercicio 4
    /**
	 * @param  este metodo resive un Linkedlist (neveras) y Linkedlist (solicitudes)
	 * @see implementa un size, el metodo getNumero y getString 
	 */
    public static void ejercicio4(LinkedList<String> neveras, LinkedList<String> solicitudes){
        System.out.print("[");
        int x = solicitudes.size();
        for(int i = 0; i<x; i++){
            String a = solicitudes.removeLast();
            System.out.print("(" + getString(a) +", " + "[");
            for(int j = 0; j<getNumero(a); j++){
                if(neveras.size() !=0){
                    System.out.print(neveras.removeLast()); 
                    if(j != getNumero(a)-1){
                        System.out.print(", ");
                    }
                }
            }
            System.out.print("])" + ", ");
        }
        System.out.print("]");
        System.out.println();
    }
    private static int getNumero(String a){
        int x = 0;
        int y = 0;
        int i = 0;
        while(i < a.length()){
            if(a.charAt(i) == ','){
                x = i + 2;
            }
            if(a.charAt(i)== ')'){
                y = i;
            }
            i++;
        }
        return Integer.parseInt(a.substring(x,y));
    }
    private static String getString(String a){
        int x = 0;
        int i = 0;
        while(i < a.length()){
            if(a.charAt(i) == ','){
                x = i;
            }
            i++;
        }
        return a.substring(1,x);
    }
    
    //Main
     public static void main(String args[]){
        LinkedList<Integer> linked1 = new LinkedList<Integer>();
        LinkedList<Integer> linked2 = new LinkedList<Integer>();
        LinkedList<String> almacen = new LinkedList<String>();
        LinkedList<String> solicitudes = new LinkedList<String>();
        
        //Ejemplo Ejercicio 1
        System.out.println("Ejemplo Ejercicio 1:");
        linked1.add(1);
        linked1.add(2);
        linked1.add(3);
        linked1.add(4);
        System.out.println(multiplicacion(linked1));
        System.out.println();
        
        //Ejemplo Ejercicio 3
        System.out.println("Ejemplo Ejercicio 3:");
        linked2.add(10);
        linked2.add(20);
        linked2.add(5);
        linked2.add(3);
        linked2.add(20);
        linked2.add(10);
        System.out.println(pivote(linked2));
        System.out.println();
        
        //Ejemplo Ejercicio 4
        System.out.println("Ejemplo Ejercicio 4:");
        almacen.add("(1, haceb)");
        almacen.add("(2, lg)");
        almacen.add("(3, ibm)");
        almacen.add("(4, haceb)");
        almacen.add("(5, lg)");
        almacen.add("(6, ibm)");
        almacen.add("(7, haceb)");
        almacen.add("(8, lg)");
        almacen.add("(9, ibm)");
        almacen.add("(8, lg)");
        almacen.add("(9, ibm)");
        solicitudes.add("(eafit, 10)");
        solicitudes.add("(la14, 2)");
        solicitudes.add("(olimpica, 4)");
        solicitudes.add("(éxito, 1)");
        ejercicio4(almacen, solicitudes);
        System.out.println();
    }
}
