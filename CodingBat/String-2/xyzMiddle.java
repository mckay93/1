public boolean xyzMiddle(String str) {
  int l = str.length();
  int mid = (int) Math.ceil(l/2.);
  
  if(l <= 3) return l == 3;
  
  return str.substring(mid-2, mid+(2-l%2)).contains("xyz");
}
