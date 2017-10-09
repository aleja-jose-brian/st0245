package PuntoUno;
import java.lang.IndexOutOfBoundsException;
public class LinkedListMauricio
{
    private Node first;
    private int size;
    public LinkedListMauricio()
    {
	    size = 0;
	    first = null;	
    }
    private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < size) {
			Node temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	public int get(int index) {
		Node temp = null;
		try {
			temp = getNode(index);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(0);
		}
		return temp.data;
	}
	public int size(){
	    return size;
    }
    public void insert(int data, int index){
        if(index >= 0 && index <= size){
            Node temp = new Node(data);
            if(index == 0){
                temp.next = first;
                first = temp;
            }else{
                if(index == size){
                    Node aux = first;
                    while(aux.next != null){
                        aux = aux.next;
                    }
                    aux.next = temp;
                }else{
                    Node aux = first;
                    for(int i = 0; i < index -1; i++){
                        aux = aux.next;
                    }
                    Node next = aux.next;
                    aux.next = temp;
                    temp.next = next;
                }
            }
            size ++;
        }
    }
    public void remove(int index){
        if(index >= 0 && index < size){
            if(index == 0){
                first = first.next;
            }else{
                Node temp = first;
                for(int i = 0; i < index-1; i++){
                    temp = temp.next;
                }
                Node next = temp.next;
                temp.next = next.next; 
            }
            size --;
        }        
    }
    public boolean contains(int data){
        for(int i = 0; i<size; i++){
            if(get(i) == data){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(1,0);
        list.insert(2,1);
        list.insert(3,2);
        list.insert(4,3);
        list.insert(5,4);
        list.remove(3);
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.contains(3));
        System.out.println(list.contains(6));
    }
}

