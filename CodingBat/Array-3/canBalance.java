public boolean canBalance(int[] nums) {
  int left = 0;
  int right = 0;
  
  for(int n : nums) left += n;
  
  for(int i = 0; i < nums.length - 1; i++){
    left -= nums[i];
    right += nums[i];
    
    if(right == left) return true;
  }
  
  return false;
}
