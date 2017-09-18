import java.util.Stack; 
public class Punto3
{   
    public int pila(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
        }
        return computar(st);      
    }
    
    public int computar(Stack<Character> st){
        while(st.empty()==false){
            char a = st.pop();
            char b = st.pop();
            char c = st.pop();
            int d = Integer.valueOf(Character.toString(a));
            int e = Integer.valueOf(Character.toString(b));
            if(c=='*'){
                st.push(Integer.toString(mult(d, e)).charAt(0));
            }
            if(c=='+'){
                st.push(Integer.toString(sum(d, e)).charAt(0));
            }
            if(c=='-'){
                st.push(Integer.toString(rest(d, e)).charAt(0));
            }
        }
        return Integer.parseInt(Character.toString(st.peek()));
    }
    
    public int mult(int a, int b){
        return a*b;
    }
    public int sum(int a, int b){
        return a+b;
    }
    public int rest(int a, int b){
        return a-b;
    }
}