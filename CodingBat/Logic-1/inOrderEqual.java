public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  return equalOk ? 
    a <= b && c >= b :
    a < b && c > b;
}
