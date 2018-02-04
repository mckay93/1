public String mirrorEnds(String string) {
  String last = "";
  int l = string.length();
  
  for(int i = 1, j = l-1; i <= l; i++, j--){
    String reverse = 
      new StringBuilder(string.substring(j, l)).reverse().toString();
    if(string.substring(0, i).equals(reverse)){
      last = string.substring(0, i);
    }
  }
  
  return last;
}
