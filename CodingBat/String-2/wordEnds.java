public String wordEnds(String str, String word) {
  String result = "";
  int strLength = str.length();
  int wordLength = word.length();
  if(strLength == wordLength) return "";
  
  for(int i = 0; i < strLength - wordLength + 1; i++){
    if(str.substring(i, i + wordLength).equalsIgnoreCase(word)){
      if(i == 0){
        result += str.charAt(i + wordLength);
        continue;
      }
      if(i == strLength - wordLength){
        result += str.charAt(i-1);
        continue;
      }
      result += String.valueOf(str.charAt(i-1)) + 
        str.charAt(i+wordLength);
    }
  }
  
  return result;
}
