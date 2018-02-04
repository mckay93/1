public boolean specialEleven(int n) {
  return n%11 == 0 ? true : (n-1)%11 == 0;
}
