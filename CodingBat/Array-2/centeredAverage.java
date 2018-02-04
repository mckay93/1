public int centeredAverage(int[] nums) {
  int min = Arrays.stream(nums).min().getAsInt();
  int max = Arrays.stream(nums).max().getAsInt();
  int sum = Arrays.stream(nums).sum();
  return (sum - (max + min)) / (nums.length - 2);
}
