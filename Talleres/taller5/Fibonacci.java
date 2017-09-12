
/**
 * Write a description of class punto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
     public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

  public static void main(String[] args){
     for (int i = 0; i < 50; i++){
         long startTime = System.nanoTime();
         fibonacci(i);
         long estimatedTime = System.nanoTime() - startTime;       
         System.out.println(i+" "+estimatedTime);
     }
   
  }



}
