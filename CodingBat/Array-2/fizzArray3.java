public int[] fizzArray3(int start, int end) {
  int arr[] = new int[end-start];
  
  for(int i = 0, j = start; i < arr.length; i++, j++) arr[i] = j;
  
  return arr;
}
