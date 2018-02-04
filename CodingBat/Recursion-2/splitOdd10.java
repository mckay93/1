public boolean splitOdd10(int[] nums) {
  return splitOdd10Helper(0, nums, 0, 0);
}
public boolean splitOdd10Helper(int start, int[] nums, int left, int right){
  if(start >= nums.length){
    return left%10 == 0 && right%2 != 0;
  }
  
  if(splitOdd10Helper(start + 1, nums, left + nums[start], right)) return true;
  if(splitOdd10Helper(start + 1, nums, left, right + nums[start])) return true;
  
  return false;
}