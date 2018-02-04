public String sameEnds(String string) {
  String last = "";
  for(int i = 1; i <= string.length()/2; i++){
    String sub = string.substring(0, i);
    if(string.startsWith(sub) && string.endsWith(sub)){
      last = sub;
    }
  }
  
  return last;
}
