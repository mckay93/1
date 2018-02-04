public boolean split53(int[] nums) {
  return split53Helper(0, nums, 0, 0);
}
public boolean split53Helper(int start, int[] nums, int left, int right){
  if(start >= nums.length) return left == right;
  
  if(nums[start]%5 == 0){
    return split53Helper(start + 1, nums, left + nums[start], right);
  }else{
    if(nums[start]%3 == 0){
      return split53Helper(start + 1, nums, left, right + nums[start]);
    }
  }
  
  if(split53Helper(start + 1, nums, left + nums[start], right)) return true;
  if(split53Helper(start + 1, nums, left, right + nums[start])) return true;
  
  
  return false;
}
