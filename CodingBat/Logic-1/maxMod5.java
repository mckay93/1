public int maxMod5(int a, int b) {
  int modA = a%5;
  int modB = b%5;
  
  if(modA == modB){
    if(a == b) return 0;
    return a < b ? a : b;
  }
  return a > b ? a : b;
}
