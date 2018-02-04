public int[] post4(int[] nums) {
  int pos = -1;
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 4) pos = i;
  }
  
  return Arrays.copyOfRange(nums, pos+1, nums.length);
}
