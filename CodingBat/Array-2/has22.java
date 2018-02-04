public boolean has22(int[] nums) {
  int last = nums.length > 0 ? nums[0] : 0;
  for(int i = 1; i < nums.length; i++){
    if(last == 2 && last == nums[i]) return true;
    last = nums[i];
  }
  return false;
}
