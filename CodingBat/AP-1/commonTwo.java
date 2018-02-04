public int commonTwo(String[] a, String[] b) {
  String lastDublicate = "";
  int posA = 0;
  int posB = 0;
  int counter = 0;
  
  while(posA < a.length && posB < b.length){
    if(a[posA].compareTo(b[posB]) == 0){
      if(!lastDublicate.equals(a[posA])){
        lastDublicate = a[posA];
        counter++;
        posA++;
        posB++;
        continue;
      }
    }
    if(a[posA].compareTo(b[posB]) < 0) posA++;
    else posB++;
  }
  
  return counter;
}
