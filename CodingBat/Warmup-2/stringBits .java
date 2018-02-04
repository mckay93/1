public String stringBits(String str) {
  int i = 0;
  String result = "";
  while(i < str.length()){
    result += String.valueOf(str.charAt(i));
    i += 2;
  }
    
  return result;
}
