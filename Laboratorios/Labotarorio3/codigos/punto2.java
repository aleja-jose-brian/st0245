/**
 * Write a description of class insertshop here.
 * 
 * @author (Alejandra ossa yepes/Jose andres/Brian fernandez morales) 
 * @version (20/09/2017)
 * @see <laboratori#3>
 *
 */
import java.util.LinkedList;
import java.util.Scanner;
public class punto2{
    
     LinkedList<String> lista= new LinkedList<String>();
     /**
	 * @param  main
	 */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        punto2 a= new punto2();
        System.out.println("Escriba la frase");
        String n= sc.nextLine();
        String n2= a.RecibirString(n).toString();
        System.out.println(a.print(n2));
      
        
    }
    /**
	 * @param  este metodo es una LinkendList <string>
	 * @see implementa un add
	 */
    private  LinkedList<String> RecibirString(String cadena){
        //cadena.length=n
        int k=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='['){
                k=0;//c1+n
            }
            else if(cadena.charAt(i)==']'){
                k=lista.size();//c2+n
            }
            else {
                lista.add(k,cadena.charAt(i)+"");// c3+n*O(n)
                
                k++;
            }
        }
        
        return lista;
        // Complejidad: c1+n+c2+n+c3+n*n= O(c´+n^2)= o(n^2)
    }
    /**
	 * @param  este metodo resive String s
	 * @see implementa un get y un add 
	 */
    public String print(String a){
        String b= "";
        for(int i=0;i<a.length();i++){
            if(!(a.charAt(i)==',')){
                b=b+a.charAt(i);
            }
            
        }
        return a;
        
    }
    
}

