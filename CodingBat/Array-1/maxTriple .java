public int maxTriple(int[] nums) {
  if(nums.length == 1) return nums[0];
  return Math.max(nums[0], Math.max(
    nums[(int) nums.length/2], 
    nums[nums.length-1]));
}
