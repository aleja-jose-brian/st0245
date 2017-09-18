
import java.util.Stack;
class Ejemplo{
   public static void  main(String[] args){
       Stack<String> s = new Stack();
       s.push("Mauricio");
       s.push("Helmuth");
       System.out.println(s.peek());
       System.out.println(s.pop());
       System.out.println(s.pop());
   }
}

