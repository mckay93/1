public int[] shiftLeft(int[] nums) {
  int l = nums.length;
  if(l == 0) return nums;
  
  int numsN[] = new int[l];
  
  for(int i = 1; i < l; i++) numsN[i-1] = nums[i];
  numsN[l-1] = nums[0];
  
  return numsN;
}
