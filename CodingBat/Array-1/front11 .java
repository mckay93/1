public int[] front11(int[] a, int[] b) {
  int lA = a.length;
  int lB = b.length;
  
  if(lA == 0 && lB == 0) return a;
  if(lA >= 1 && lB >= 1)
    return new int[]{a[0], b[0]};
  return lA == 0 ? new int[]{b[0]} : new int[]{a[0]};
}
