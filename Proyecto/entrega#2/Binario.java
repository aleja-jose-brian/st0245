import java.util.Arrays;
 import java.util.Random;
public class Binario
{
    public static int busquedaBinaria(int x, int[] A){
        int inicio= 0;
        int fin= A.length-1;
        int medio;
        Arrays.sort (A);
        while (inicio<=fin){
            medio=(inicio+fin)/2;
            if(A[medio]<x)inicio= medio+1;
            else if (A[medio]>x) fin= medio-1;
            else return medio;
        }
        return -1;
        }
    public static void main(String[] args) {
         int size = 10000000;
         int max = 5000;
         int[] array = new int[size];
         Random generator = new Random();
         for (int i =0; i<size; i++){
         array[i] = generator.nextInt(max);
        }
        int elem =(int) (Math.random()*9999999+1);;
        long startTime = System.currentTimeMillis();
        int result = busquedaBinaria(elem, array);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("busqueda binaria.-la posicion del elemento:"+elem +" es "+result);
        System.out.println(estimatedTime);
    }
    
}

