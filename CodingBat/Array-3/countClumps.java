public int countClumps(int[] nums) {
  int clumps = 0;
  Integer last = null;
  int counter = 0;
  
  for(int n : nums){
    if(last == null){
      last = n;
      counter = 1;
    }else{
      if(last == n){
        counter++;
      }else{
        if(counter > 1){
          clumps++;
        }
        last = n;
        counter = 1;
      }
    }
  }
  
  return clumps = counter > 1 ? clumps + 1 : clumps;
}
