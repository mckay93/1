public int[] zeroFront(int[] nums) {
  for(int i = 0; i < nums.length; i++){
    int x = nums[i];
    int j = i;
    while(j > 0 && Math.abs(nums[j - 1]) > Math.abs(x)){
      nums[j] = nums[j-1];
      j = j - 1;
    }
    nums[j] = x;
  }
  
  return nums;
}
