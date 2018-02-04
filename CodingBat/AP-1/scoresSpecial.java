public int scoresSpecial(int[] a, int[] b) {
  return scoresSpecial(a) + scoresSpecial(b);
}
public int scoresSpecial(int[] in){
  int max = 0;
  
  for(int a : in){
    if(a%10 == 0){
      max = a > max ? a : max;
    }
  }
  
  return max;
}