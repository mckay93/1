public int[] copyEvens(int[] nums, int count) {
  int result[] = new int[count];
  
  for(int i = 0, pos = 0; pos < count; i++){
    if(nums[i]%2 == 0) result[pos++] = nums[i];
  }
  
  return result;
}
