public boolean scoresIncreasing(int[] scores) {
  Integer last = null;
  
  for(int n : scores){
    if(last == null){
      last = n;
      continue;
    }
    
    if(last > n) return false;
    last = n;
  }
  
  return true;
}
