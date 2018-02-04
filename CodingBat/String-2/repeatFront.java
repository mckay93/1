public String repeatFront(String str, int n) {
  String s = str.substring(0, n);
  String result = "";
  
  for(int i = n; i >= 0; i--){
    result += s.substring(0, i);
  }
  
  return result;
}
