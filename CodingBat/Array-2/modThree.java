public boolean modThree(int[] nums) {
  int counter = 0;
  boolean lastIsEven = false;
  
  for(int n : nums){
    if(counter == 0){
      lastIsEven = n%2 == 0;
      counter++;
    }else{
      if((n%2 == 0 && lastIsEven) || (n%2 != 0 && !lastIsEven)) counter++;
      else{
        lastIsEven = n%2 == 0;
        counter = 1;
      }
      if(counter == 3) return true;
    }
  }
  
  return false;
}
