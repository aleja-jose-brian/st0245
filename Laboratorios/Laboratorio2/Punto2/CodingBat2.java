public class CodingBat2
{
    public int maxSpan(int[] nums) {
    if (nums.length > 0) {
        int max = 1;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j > i; j--)
                if (nums[j] == nums[i]) {
                    int count = (j - i) + 1;
                    if (count > max) max = count;
                    break;
                }
        return max;
    } else return 0;
  }
  
  public int[] fix34(int[] nums) {
   for (int i = 0; i < nums.length; i++)
        if (nums[i] == 3) {
            int temp = nums[i + 1];
            nums[i + 1] = 4;
            for (int j = i + 2; j < nums.length; j++)
                if (nums[j] == 4) nums[j] = temp;
        }
    return nums;
}

public int[] fix45(int[] nums) {
   for (int i = 0; i < nums.length; i++)
        if (nums[i] == 5 && i == 0
            || nums[i] == 5 && nums[i - 1] != 4) {
            int pos5 = i;
            for (int j = 0; j < nums.length; j++)
                if (nums[j] == 4 && nums[j + 1] != 5) {
                    int temp = nums[j + 1];
                    nums[j + 1] = 5;
                    nums[pos5] = temp;
                    break;
                }
    }
    return nums;
}

public boolean canBalance(int[] nums) {
  int acomulador=0;
  for(int i=0; i<nums.length; i++){
  int acomulador2=0;
  for (int j=i; j<nums.length; j++){
    acomulador2+=nums[j];
  }
    if (acomulador==acomulador2) return true;
    acomulador+=nums[i];
  }
  return false;
}

public boolean linearIn(int[] outer, int[] inner) {
    int a = 0;
    int b = 0;
    while (a < inner.length && b < outer.length) {
        if (outer[b] == inner[a]) {
            b++;
            a++;
        } else b++;
    }
    return (a == inner.length);
}
}
