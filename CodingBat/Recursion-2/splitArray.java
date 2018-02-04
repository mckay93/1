public boolean splitArray(int[] nums) {
  return splitArrayHelper(0, nums, 0, 0);
}
public boolean splitArrayHelper(int start, int[] nums, int left, int right){
  if(start >= nums.length) return left == right;
  
  if(splitArrayHelper(start + 1, nums, left + nums[start], right)) return true;
  if(splitArrayHelper(start + 1, nums, left, right + nums[start])) return true;
  
  return false;
}
