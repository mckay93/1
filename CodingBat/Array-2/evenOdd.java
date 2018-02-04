public int[] evenOdd(int[] nums) {
  int result[] = new int[nums.length];
  int pos = 0;
  
  for(int n : nums){
    if(n%2 == 0) result[pos++] = n;
  }
  for(int n : nums){
    if(n%2 != 0) result[pos++] = n;
  }
  
  return result;
}
