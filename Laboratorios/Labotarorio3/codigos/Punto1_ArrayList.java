/**
 * Write a description of class insertshop here.
 * 
 * @author (Alejandra ossa yepes/Jose andres/Brian fernandez morales) 
 * @version (20/09/2017)
 * @see <laboratori#3>
 *
 */
import java.util.ArrayList;
import java.util.LinkedList;
public class Punto1_ArrayList
{
    //Ejercicio 1
    /**
	 * @param  este metodo resive un Arraylist (array)
	 * @see esta implementado un metodo size y un get.
	 */
    public static int multiplicacion(ArrayList<Integer> array){
        int mult = 1;      
        for(int i=0; i<array.size(); i++){
            mult *= array.get(i);
        }
        return mult;
    }
    
    //Ejercicio 2
    /**
	 * @param  este metodo resive un Arraylist (array) y un entero date
	 * @see implementa un get y un add 
	 */
    public static void SmartIncert(ArrayList<Integer> array, int data){
        int igual = 0;
        for(int i = 0; i<array.size(); i++){
            if(array.get(i) == data){
                igual ++;
            }
        }
        if(igual == 0){
            array.add(data);
        } 
    }
    
    //Ejercicio 3
    /**
	 * @param  este metodo resive un Arraylist (array)
	 */
    public static int pivote(ArrayList<Integer> array){
        int[] sum = suma(array);
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
    private static int[] suma(ArrayList<Integer> array){
        int sum = 0;      
        int[] suma = new int[array.size() + 1];
        suma[0] = 0;
        for(int i=0; i< array.size(); i++){            
            sum += array.get(i);
            suma[i + 1] = sum;
        }
        return suma;
    }
    
    //Ejercicio 4
    /**
	 * @param  este metodo resive un Arraylist (neveras) y Arraylist (solicitudes)
	 * @see implementa un size, el metodo getNumero y getString 
	 */
    public static void ejercicio4(ArrayList<String> neveras, ArrayList<String> solicitudes){
        System.out.print("[");
        int x = solicitudes.size();
        for(int i = 0; i<x; i++){
            String a = solicitudes.remove(solicitudes.size()-1);
            System.out.print("(" + getString(a) +", " + "[");
            for(int j = 0; j<getNumero(a); j++){
                if(neveras.size() !=0){
                    System.out.print(neveras.remove(neveras.size()-1)); 
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
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<String> almacen = new ArrayList<String>();
        ArrayList<String> solicitudes = new ArrayList<String>();
        
        //Ejemplo Ejercicio 1
        System.out.println("Ejemplo Ejercicio 1:");
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        System.out.println(multiplicacion(array1));
        System.out.println();
        
        //Ejemplo Ejercicio 3
        System.out.println("Ejemplo Ejercicio 3:");
        array2.add(10);
        array2.add(20);
        array2.add(5);
        array2.add(3);
        array2.add(20);
        array2.add(10);
        System.out.println(pivote(array2));
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
