public int[] squareUp(int n) {
  if(n == 0) return new int[]{};
  int result[] = new int[n*n];
  int counter = 1;
  
  for(int i = n-1; i < result.length; i+=n){
    for(int j = i, c = 1; c <= counter; j--, c++){
      result[j] = c;
    }
    counter++;
  }
  
  return result;
}
