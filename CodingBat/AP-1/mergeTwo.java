public String[] mergeTwo(String[] a, String[] b, int n) {
  String result[] = new String[n];
  int posA = 0;
  int posB = 0;
  
  for(int i = 0; i < n; i++){
    if(a[posA].compareTo(b[posB]) < 0){
      result[i] = a[posA++];
    }else{
      if(b[posB].compareTo(a[posA]) < 0){
        result[i] = b[posB++];
      }else{
        result[i] = b[posB++];
        posA++;
      }
    }
  }
  
  return result;
}
