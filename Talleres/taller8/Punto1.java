
/**
 * Write a description of class punto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Stack; 
import java.util.Queue;     
import java.util.LinkedList;                                                                                                                                                                                                                                                                                                                           
public class Punto1
{
    public static void main(String[] args){
      Stack<Integer> stack = new Stack<Integer>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.println(stack);
     System.out.println(invertir(stack));
    }
      public static Stack invertir(Stack<Integer> s){
        Queue<Integer> q = new LinkedList();
        Stack<Integer> p= new Stack<Integer>();
        while(s.size()>0){
            q.add(s.pop());
        }
        while(q.size()>0){
            p.push(q.remove());
            
        }
        return p;
     
        
}
  
}
