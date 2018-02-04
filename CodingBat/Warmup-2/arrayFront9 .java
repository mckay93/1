public boolean arrayFront9(int[] nums) {
  int length = nums.length < 4 ? nums.length : 4;
  for(int i = 0; i < length; i++){
    if(nums[i] == 9)
      return true;
  }
  return false;
}
