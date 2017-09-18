
/**
 * Write a description of class Punto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.LinkedList;
import java.util.Queue;
public class Punto2
{
  public static void dos(){
        Queue<String> queue = new LinkedList<String>();
        queue.add("Juan");
        queue.add("María");
        queue.add("Pedro");
        while(queue.size()>0){
            System.out.println("Atiendo a " + queue.remove());
        }
    }
}
