public boolean groupSumClump(int start, int[] nums, int target) {
  int groupSum = 0;
  int counter = 0;
  if(start >= nums.length) return target == 0;
  
  for(int i = start; i < nums.length - 1; i++){
    if(nums[i] == nums[i+1]){
      counter++;
      groupSum += nums[i];
    }else{
      counter++;
      groupSum += nums[i];
      break;
    }
  }
  
  if(counter > 1){
    if(groupSumClump(start + counter, nums, target - groupSum)) return true;
    if(groupSumClump(start + counter, nums, target)) return true;
  }else{
    if(groupSumClump(start + 1, nums, target - nums[start])) return true;
    if(groupSumClump(start + 1, nums, target)) return true;
  }
  
  return false;
}
