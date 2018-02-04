public boolean lucky13(int[] nums) {
  Arrays.sort(nums);
  return Arrays.binarySearch(nums, 1) < 0 && Arrays.binarySearch(nums, 3) < 0;
}
