public boolean unlucky1(int[] nums) {
  int length = nums.length;
  
  if(length <= 1) return false;
  if(length <= 4) {
    for(int i = 0; i < length-2; i++){
      if(nums[i] == 1 && nums[i+1] == 3) return true;
    }
  }
  
  return (nums[0] == 1 && nums[1] == 3) ||
    (nums[1] == 1 && nums[2] == 3) ||
    (nums[length-2] == 1 && nums[length-1] == 3);
}
