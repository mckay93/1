public boolean no14(int[] nums) {
  int countOf1 = 0;
  int countOf4 = 0;
  for(int n : nums){
    if(n == 1) countOf1++;
    if(n == 4) countOf4++;
  }
  return countOf1 == 0 || countOf4 == 0;
}
