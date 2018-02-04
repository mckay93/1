public String doubleChar(String str) {
  String result = "";
  for(int i = 0; i < str.length(); i++){
    result += String.valueOf(str.charAt(i)) + str.charAt(i);
  }
  
  return result;
}
