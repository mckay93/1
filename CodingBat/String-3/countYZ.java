public int countYZ(String str) {
  int counter = 0;
  int l = str.length();
  
  for(int i = 0; i < l; i++){
    if(i+1 == l ||
      String.valueOf(str.charAt(i+1)).matches("[\\W\\d]")){
      if(String.valueOf(str.charAt(i)).matches("[zZyY]")){
        counter++;
      }
    }
  }
  
  return counter;
}
