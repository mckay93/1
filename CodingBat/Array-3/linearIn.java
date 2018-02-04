public boolean linearIn(int[] outer, int[] inner) {
  for(int n : inner){
    if(Arrays.binarySearch(outer, n) < 0) return false;
  }
  
  return true;
}
