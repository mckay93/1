public boolean array123(int[] nums) {
  int last = -1;
  int count = 1;
  for(int i : nums){
    if(last == i-1){
      last = i;
      count++;
    }else{
      last = i;
      count = 1;
    }
    if(count == 3) return true;
  }
  return false;
}
