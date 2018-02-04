public int bigDiff(int[] nums) {
  return Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt();
}
