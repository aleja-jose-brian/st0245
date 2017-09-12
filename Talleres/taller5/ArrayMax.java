
/**
 * Write a description of class ArrayMax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.concurrent.TimeUnit;
public class ArrayMax
{
     public static int subprocesoArrayMax(int [] A,int n ){
       int i;
       int max=A[n];
       if(n!=0){
         int  temp=subprocesoArrayMax(A,n-1);
        if(temp>max){
            max=temp;
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
        return max;
    }
    public static int[] Arreglo(int n){
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]=i;
        }
        return A;
            
    }
    public static void main(String[] args){
      for (int i = 1; i < 1001; i++){
          int[] a = Arreglo(i);
         long startTime = System.nanoTime();
         subprocesoArrayMax(a,i-1);
         long estimatedTime = System.nanoTime() - startTime;       
         System.out.println(i+" "+estimatedTime);
     }
    }
}

