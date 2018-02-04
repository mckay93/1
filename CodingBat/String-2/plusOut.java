public String plusOut(String str, String word) {
  return str.replaceAll("\\G((" + word.replaceAll("\\+","\\\\+") + ")*+).", "$1+");
}