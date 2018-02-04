public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(groupSum6(start + 1, nums, target - nums[start])) return true;
  if(nums[start] == 6){
    groupSum6(start + 1, nums, target);
  }else{
    if(groupSum6(start + 1, nums, target)) return true;
  }
  return false;
}
