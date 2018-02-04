public String oneTwo(String str) {
  int strL = str.length();
  int last = strL - strL%3;
  String result = "";
  
  for(int i = 0; i < strL - strL%3; i += 3){
    result += str.substring(i+1, i+3) + str.charAt(i);
  }
  
  return result;
}
