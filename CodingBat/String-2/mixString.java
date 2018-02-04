public String mixString(String a, String b) {
  int l = Math.min(a.length(), b.length());
  String result = "";
  
  for(int i = 0; i < l; i++){
    result += a.charAt(i);
    result += b.charAt(i);
  }
  if(l < a.length()){
    return result + a.substring(l, a.length());
  }
  if(l < b.length()){
    return result + b.substring(l, b.length());
  }
  
  return result;
}
