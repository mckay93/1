public int countEvens(int[] nums) {
  int counter = 0;
  for(int i : nums){
    if(i%2 == 0) counter++;
  }
  return counter;
}
