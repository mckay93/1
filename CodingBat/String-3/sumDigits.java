public int sumDigits(String str) {
  int sum = 0;
  for(int i = 0; i < str.length(); i++){
    char c = str.charAt(i);
    if(Character.isDigit(c)){
      sum += Character.getNumericValue(c);
    }
  }
  
  return sum;
}
