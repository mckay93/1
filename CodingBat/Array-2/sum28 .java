public boolean sum28(int[] nums) {
  //return Arrays.stream(nums).filter(n -> n == 2).sum() == 8; shit happens
  int sum = 0;
  for(int i : nums){
    if(i == 2) sum += i;
  }
  return sum == 8;
}
