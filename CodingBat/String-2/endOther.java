public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  return a.endsWith(b) || b.endsWith(a);
}
