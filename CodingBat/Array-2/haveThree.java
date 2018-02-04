public boolean haveThree(int[] nums) {
  int last = -1;
  int counter = 0;
  for(int i = 0; i < nums.length; i++){
    if(last > -1 && nums[i] == 3 && i%2 == last%2){
      counter++;
    }
    if(last == -1 && nums[i] == 3){
      last = i;
      counter++;
    }
  }
  
  return counter == 3;
}
