public boolean has12(int[] nums) {
  int pos1 = -1;
  int pos2 = -1;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1) pos1 = i;
    if(nums[i] == 2) pos2 = i;
  }
  
  return pos1 > -1 && pos2 > -1 && pos1 < pos2;
}
