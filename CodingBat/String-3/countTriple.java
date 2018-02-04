public int countTriple(String str) {
  int mainCounter = 0;
  int localCounter = 1;
  char lastC = '_';
  
  for(int i = 0; i < str.length(); i++){
    char currC = str.charAt(i);
    if(lastC != currC){
      lastC = currC;
      localCounter = 1;
    }else{
      if(++localCounter >= 3) mainCounter++;
    }
  }
  
  return mainCounter;
}
