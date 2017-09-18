import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class insertshop here.
 * 
 * @author (Alejandra ossa yepes/Jose andres/Brian fernandez morales) 
 * @version (08/09/2017)
 * @see <laboratori#2>
 *
 */
public class insertshop
{
   public static void ordenamiento(int []array){
       int aux;
       int c1;
       int c2;
                for(c1=1; c1<array.length; c1++){
               aux=array[c1];
               for(c2=c1-1; c2>=0 && array[c2]>aux; c2--){
                 array[c2+1]=array[c2];
                 array[c2]=aux;
                }
             }
             for (int i=0; i<array.length; i++){
              System.out.println(array[i]);
             }
    }
   public static void main(String[]args){
       int size =1000;
       int max =20;
       int[] arreglo = new int[size];
       Random generator = new Random();
       for (int i =0; i<size; i++){
         arreglo[i] = generator.nextInt(max);
       }
       long startTime = System.nanoTime();
       ordenamiento(arreglo);
       long estimatedTime =System.currentTimeMillis()-startTime;       
       System.out.println("hola"+estimatedTime);
    }
   }

    
