import java.util.*;

public class MiArrayList
{
        private int size;
        private static final int DEFAULT_CAPACITY = 10;
        private int elements[];
        public MiArrayList() {
            size=0;
            elements = new int [DEFAULT_CAPACITY];
            
       
        }
        public int size() {
            return  size;
            
   
        }
         public void add(int e) {
             elements[size]=e;
             size++;
             
        }
        public int get(int i) {
            return elements[i];
   
        }
         public void add(int index, int e) {
             if (size()-1<DEFAULT_CAPACITY){
                 if(index<=size()-1){
                     for (int i=size-1; i>=index; i--){
                         elements[i+1]=elements[i];
                     }
                     size++;
                    elements[index]=e;
                    }
             }
        }
        public void print(){
            System.out.print("[ ");
            for(int i=0; i < size; i++){
                System.out.print(elements[i] + " ");
            }
            System.out.println("]");
        }
        public static void main (String[] args){
           //ArrayList a= new ArrayList<>();
           MiArrayList a = new MiArrayList();
           //System.out.println(a.size());
           a.add(1);
           a.add(2);
           a.add(3);
           a.add(4);
           a.add(2,5);
           a.add(6);
           a.add(1, 11);
           a.print();
        }

}
