public int[] frontPiece(int[] nums) {
  if(nums.length <= 2) return nums;
  return Arrays.copyOfRange(nums, 0, 2);
}
