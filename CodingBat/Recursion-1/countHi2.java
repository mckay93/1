public int countHi2(String str) {
  if(str.length() == 0) return 0;
  if(str.length() >= 2){
    if(str.length() > 2 && str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")){
      return countHi2(str.substring(3));
    }
    if(str.substring(0, 2).equals("hi")){
      return 1 + countHi2(str.substring(2));
    }
  }
  return countHi2(str.substring(1));
}
