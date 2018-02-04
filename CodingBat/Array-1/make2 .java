public int[] make2(int[] a, int[] b) {
  int lA = a.length;
  int lB = b.length;
  
  if(lA == 0 && lB == 0) return a;
  if(lA == 0 || lB == 0){
    int[] tmp = (lA == 0) ? b : a;
    if(tmp.length <= 2) return tmp;
    if(tmp.length > 2) return Arrays.copyOfRange(tmp, 0, 2);
  }
  return lA >= 2 ? 
    Arrays.copyOfRange(a, 0, 2) : new int[]{a[0], b[0]};
}
