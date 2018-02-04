public int maxBlock(String str) {
  char lastC = '\n';
  int counter = 0;
  int largest = 0;
  
  for(int i = 0; i < str.length(); i++){
    char currC = str.charAt(i);
    if(currC != lastC){
      if(counter > largest){
        largest = counter;
      }
      lastC = currC;
      counter = 1;
    }else{
      counter++;
    }
  }
  
  return counter > largest ? counter : largest;
}
