package PuntoUno;
import java.util.Queue;
import java.util.LinkedList;
public class Filas
{
    private Queue<String> uno;
    private Queue<String> dos;
    private Queue<String> tres;
    private Queue<String> cuatro;
    private Queue<String> granFila = new LinkedList();
    public Filas(Queue<String> uno, Queue<String> dos, Queue<String> tres, Queue<String> cuatro){
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
        this.cuatro = cuatro;
    }
    public Queue<String> gF(){
        while(uno.size() != 0 || dos.size() != 0 || tres.size() != 0 || cuatro.size() != 0){
            granFila.add(uno.poll());
            granFila.add(dos.poll());
            granFila.add(tres.poll());
            granFila.add(cuatro.poll());
        }
        return granFila;
    }
}
