public int[] seriesUp(int n) {
  int result[] = new int[n*(n+1)/2];
  int counter = 1;
  
  for(int i = 0; i < result.length; i += (counter++)){
    for(int j = i, c = 1; j < i + counter; j++, c++){
      result[j] = c;
    }
  }
  
  return result;
}
