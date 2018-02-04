public int sumLimit(int a, int b) {
  int sum = a + b;
  int sumL = String.valueOf(sum).length();
  int aL = String.valueOf(a).length();
  int bL = String.valueOf(b).length();
  
  if(sumL > aL) return a;
  return sum;
}
