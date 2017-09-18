
public class CodingBat1
{
    public boolean has22(int[] nums) {
  for(int i = 0; i<nums.length-1; i++){
    if (nums[i]==2 && nums[i+1]==2)
    return true;
  }
  return false;
}

public int countEvens(int[] nums) {
  int cont=0;
  for(int i=0; i<nums.length; i++){
    if (nums[i]%2==0){
      cont++;
    }
    
  }
  return cont;
}

public int sum67(int[] nums) {
  int cont=0;
  for(int i=0; i<nums.length; i++){
    if (nums[i]==6 && nums[i+1]==7){
      nums[i]=0;
      nums[i+1]=0;
    }
    if (nums[i]==6 && nums[i+1]!=7){
      for(int j=i; j<nums.length; j++){
        
        if (nums[j]==7){
          nums[j]=0;
          break;
        }
        nums[j]=0;
      }
      
    }
    cont+=nums[i];
  }
  return cont;
}

public boolean lucky13(int[] nums) {
  int cont1=0;
  for (int i=0; i<nums.length; i++){
    if (nums[i]==1 ||nums[i]==3){
      cont1++;
    }
  }
  if(cont1==0){
    return true;
  } 
  return false;
}

public int sum13(int[] nums) {
  int cont=0;
  
  for(int i=0; i<nums.length; i++){
    if (nums[i]==13 ){
      nums[i]=0;
      if(i!=nums.length-1){
        nums[i+1]=0;
      }
     
    }
     cont +=nums[i];
    }
  return cont;
}
}
