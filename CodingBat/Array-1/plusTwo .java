public int[] plusTwo(int[] a, int[] b) {
  int[] c = new int[4];
  int i = 0;
  for(int j : a)
    c[i++] = j;
  for(int j : b)
    c[i++] = j;
  return c;
}
