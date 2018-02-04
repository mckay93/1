public boolean groupSum5(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(start > 0 && nums[start] == 1 && nums[start-1]%5 == 0){
    if(groupSum5(start + 1, nums, target)) return true;
  }else{
    if(groupSum5(start + 1, nums, target - nums[start])) return true;
  }
  if(nums[start]%5 == 0){
    groupSum5(start + 1, nums, target);
  }else{
    if(groupSum5(start + 1, nums, target)) return true;
  }
  
  return false;
}
