boolean doubleX(String str) {
  for(int i = 0; i < str.length(); i++)
    if(str.charAt(i) == 'x')
      return ((i+1) < str.length() && str.charAt(i+1) == 'x');
  return false;
}
