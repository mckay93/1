public boolean xyBalance(String str) {
  return str.matches("([^x]*x*\\w*y[^x]*)|([^xy]*)");
}
