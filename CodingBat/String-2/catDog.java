public boolean catDog(String str) {
  int cats = 0;
  int dogs = 0;
  
  for(int i = 0; i < str.length()-2; i++){
    if(str.substring(i, i+3).equals("cat"))
      cats++;
    if(str.substring(i, i+3).equals("dog"))
      dogs++;
  }
  
  return cats == dogs;
}
