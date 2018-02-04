public int[] notAlone(int[] nums, int val) {
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == val && (i + 1) < nums.length && i > 0){
      if(nums[i-1] != nums[i] && nums[i+1] != nums[i]){
        nums[i] = Math.max(nums[i+1], nums[i-1]);
      }
    }
  }
  
  return nums;
}
