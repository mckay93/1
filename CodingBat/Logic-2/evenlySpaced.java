public boolean evenlySpaced(int a, int b, int c) {
  int m[] = new int[]{a,b,c};
  Arrays.sort(m);
  return m[1] - m[0] == m[2] - m[1] ;
}
