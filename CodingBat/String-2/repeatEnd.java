public String repeatEnd(String str, int n) {
  int l = str.length();
  String result = "";
  
  for(int i = 0; i < n; i++){
    result += str.substring(l-n, l);
  }
  
  return result;
}
