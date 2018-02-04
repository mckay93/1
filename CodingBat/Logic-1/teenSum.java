public int teenSum(int a, int b) {
  int sum = a + b;
  return (a >= 13 && a <= 19) || 
    (b >= 13 && b <= 19) ? 19 : sum;
}
