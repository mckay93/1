public boolean either24(int[] nums) {
  boolean is2 = false;
  boolean is4 = false;
  for(int i = 0; i < nums.length-1; i++){
    if(nums[i] == nums[i+1] && nums[i] == 2) is2 = true;
    if(nums[i] == nums[i+1] && nums[i] == 4) is4 = true;
  }
  return is2 ^ is4;
}
