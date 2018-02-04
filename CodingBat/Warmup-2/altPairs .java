public String altPairs(String str) {
  String result = "";
  for(int i = 0; i < str.length(); i+=4){
    result += i+2 > str.length() ? str.charAt(i) : 
      str.substring(i,i+2);
  }
  return result;
}
