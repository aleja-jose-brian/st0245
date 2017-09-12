import java.util.*;
import java.util.Scanner;
class Punto2{
    public static void main(String [] args){
      ArrayList n = new ArrayList();  
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese sus numeros :");
      while (sc.hasNextInt()) {
        int tmp = sc.nextInt();
        if(tmp==-1){
            break;
        }
        n.add(0, tmp);
      }
      System.out.println(n);
    }
}
