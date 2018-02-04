int countXX(String str) {
  int count = 0;
  for(int i = 0; i < str.length(); i++)
    if(str.charAt(i) == 'x')
      if((i+1) < str.length() && str.charAt(i+1) == 'x')
        count++;
  return count;
}
