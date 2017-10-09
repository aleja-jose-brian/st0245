package PuntoUno;
import java.util.Queue;
import java.util.LinkedList;
public class Banco
{
    public static void gringotts(Queue<String> f1, Queue<String> f2, Queue<String> f3, Queue<String> f4){
        Filas filas = new Filas(f1, f2, f3, f4);
        Queue<String> granFila = filas.gF();
        while(granFila.size() != 0){
            if(granFila.peek()==null){
                granFila.remove();
            }else{
                System.out.println("Cajero 1: " + granFila.remove());
                if(granFila.size() == 0){
                    break;
                }
                if(granFila.peek() == null){
                    while(granFila.peek() == null){
                        granFila.remove();
                    }
                }
                System.out.println("Cajero 2: " + granFila.remove());
            }
        }
    }
    public static void main(String args[]){
        Queue<String> la = new LinkedList();
        la.add("Harry Potter");
        Queue<String> le = new LinkedList();
        le.add("Hermione Granger");
        le.add("Ron Weasly");
        Queue<String> li = new LinkedList();
        li.add("Draco Malfoy");
        li.add("Seamus Finnigan");
        li.add("Neville Longbotton");
        Queue<String> lo = new LinkedList();
        lo.add("Albus Dumbledore");
        lo.add("Severus Snape");
        lo.add("Minerva McGonagall");
        lo.add("Tom Ryddle");
        gringotts(la, le, li, lo);
    }
}