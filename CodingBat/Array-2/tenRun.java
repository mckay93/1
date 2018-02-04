public int[] tenRun(int[] nums) {
  int l = nums.length;
  if(l == 0) return nums;
  int m = -1;
  int numsN[] = new int[l];
  
  for(int i = 0; i < l; i++){
    if(nums[i]%10 == 0) m = (int) Math.ceil(nums[i]/10.);
    
    if(m < 0) numsN[i] = nums[i];
    else numsN[i] = m * 10;
  }
  
  return numsN;
}
