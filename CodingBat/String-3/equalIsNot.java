public boolean equalIsNot(String str) {
  int counterIs = 0;
  int counterNot = 0;
  
  for(int i = 0; i < str.length()-1; i++){
    if(str.substring(i, i+2).equals("is")){
      counterIs++;
    }
    if(i<str.length()-2 && str.substring(i, i+3).equals("not")){
      counterNot++;
    }
  }
  
  return counterIs == counterNot;
}
