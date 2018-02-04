public boolean only14(int[] nums) {
  return Arrays.stream(nums).allMatch(n -> n == 1 || n == 4);
}
