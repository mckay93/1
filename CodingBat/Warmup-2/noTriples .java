public boolean noTriples(int[] nums) {
  int last = 0;
  int count = 1;
  for(int i : nums){
    if(last == i)
      count++;
    else{
      count = 1;
      last = i;
    }
    if(count == 3)
      return false;
  }
  return true;
}
