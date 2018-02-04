public boolean closeFar(int a, int b, int c) {
  return (Math.abs(c-a) <= 1  && Math.abs(b-a) > 1 && Math.abs(c-b) > 1) ||
  (Math.abs(b-a) <= 1 && Math.abs(c-a) > 1 && Math.abs(c-b) > 1);
  
}
