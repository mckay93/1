public int[] midThree(int[] nums) {
  int mid = (int) nums.length/2;
  return Arrays.copyOfRange(nums, mid-1, mid+2);
}
