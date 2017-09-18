/**
 * Write a description of class insertshop here.
 * 
 * @author (Alejandra ossa yepes/Jose andres/Brian fernandez morales) 
 * @version (08/09/2017)
 * @see <laboratori#2>
 *
 */
import java.util.Random;
import java.util.Arrays;

public class MergeSort
{
	/**
	 * @param  este metodo resive un arreglo y  crea otro arreglo llamado tmp
	 * @see esta relacionado con mergeSort() y es un metodo recursivo
	 */
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	   System.out.println(Arrays.toString(a));
	}
	
	/**
	 * @param  este metodo resive dos arreglo a y tmp, ademas de left y ringth que son enteros, este metodo nos permite comparar los dos enteros y invocar al metodo mergeSort()
	 * @see esta relacionado con mergeSort()
	 */
	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    /**
	 * @param  este metodo resive dos arreglo a y tmp, ademas de left , ringth y  rightEnd que son enteros, este metodo posee varios ciclos, los cuales permite el ordenamiento del 
	 * arreglo, ademas esta relacionado con varias variables que utilizan otros metodos
	 */
	private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd) 
            tmp[k++] = a[left++];
        while(right <= rightEnd)  
            tmp[k++] = a[right++];
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
  
  /**
	 * @param  este es el main, el cual es el primer metodo que se va a ejecutar y tiene el comando de medir el tiempo,
	 * este metodo utiliza la invocacion de los otros metodos para su funcionamiento, ademas crea un arreglo random para el ordenamiento
	 * @see esta relacionado con mergeSort() 
	 */
	public static void main(String[] args)
  {
      int size =100000000;
       int max =20;
       int[] arreglo = new int[size];
       Random generator = new Random();
       for (int i =1; i<size; i++){
         arreglo[i] = generator.nextInt(max);
       }
       long startTime = System.nanoTime();
       MergeSort.mergeSort(arreglo);
       long estimatedTime =System.currentTimeMillis()-startTime;       
       System.out.println("hola"+estimatedTime);
        
      }
  }
  