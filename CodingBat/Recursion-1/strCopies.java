public boolean strCopies(String str, String sub, int n) {
  if(str.length() < sub.length()){
    if(n > 0) return false;
    else return true;
  }
  if(str.substring(0, sub.length()).equals(sub)){
    return strCopies(str.substring(1), sub, --n);
  }
  return strCopies(str.substring(1), sub, n);
}
