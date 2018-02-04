public int[] biggerTwo(int[] a, int[] b) {
  return Arrays.stream(b).sum() > 
    Arrays.stream(a).sum() ? b : a;
}
