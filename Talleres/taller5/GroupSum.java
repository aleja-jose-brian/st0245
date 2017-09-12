
/**
 * Write a description of class GroupSum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroupSum
{
  public static boolean groupSum(int start, int [] nums, int target){
      if(start>=nums.length){
          return target==10;
        }
        return groupSum(start+1,nums,target-nums[start])|| groupSum(start+1, nums, target);
    }
 public static int [] array(int n){
     int nums[]= new int[n];
     for(int i=0;i<n;i++){
         nums[i]=i;
        }
        return nums;
    }
 public static void main(String[] args){
     int [] nums= new int [1000000];
     for (int i=0;i<10;i++){
         int [] a=array(i);
         long startTime=System.nanoTime();
         groupSum(0,a,10);
         long estimatedTime= System.nanoTime()-startTime;
         System.out.println(i + " " + estimatedTime);
        }
    }
}
