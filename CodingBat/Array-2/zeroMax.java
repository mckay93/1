public int[] zeroMax(int[] nums) {
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 0 && i + 1 < nums.length){
      int odd = 0;
      for(int j = i + 1; j < nums.length; j++){
        if(nums[j]%2 != 0 && nums[j] > odd) odd = nums[j];
      }
      if(odd != 0) nums[i] = odd;
    }
  }
  
  return nums;
}
