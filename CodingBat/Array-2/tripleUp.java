public boolean tripleUp(int[] nums) {
  int counter = 0;
  
  for(int i = 0; i < nums.length-1; i++) {
    if(nums[i+1] - nums[i] == 1) counter++;
    else counter = 0;
    if(counter == 2) return true;
  }
  
  return false;
}
