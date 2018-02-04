public int sum67(int[] nums) {
  int sum = 0;
  boolean miss = false;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 6 && !miss){
      miss = true;
    }
    if(nums[i] == 7 && miss){
      miss = false;
      continue;
    }
    if(miss) continue;
    sum += nums[i];
  }
  
  return sum;
}
