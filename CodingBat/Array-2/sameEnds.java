public boolean sameEnds(int[] nums, int len) {
  int arrA[] = new int[nums.length];
  int arrB[] = new int[nums.length];
  
  for(int i = 0; i < len; i++) arrA[i] = nums[i];
  for(int i = nums.length - len, j = 0; i < nums.length; i++, j++) arrB[j] = nums[i];
  
  return Arrays.equals(arrA, arrB);
  
}
