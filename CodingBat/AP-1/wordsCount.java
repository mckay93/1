public int wordsCount(String[] words, int len) {
  int counter = 0;
  for(String str : words){
    if(str.length() == len) counter++;
  }
  
  return counter;
}
