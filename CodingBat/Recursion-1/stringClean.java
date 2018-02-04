public String stringClean(String str) {
  if(str.length() == 0) return "";
  if(str.length() >= 2 && str.charAt(0) == str.charAt(1)){
      return stringClean(str.substring(1));
  }
  return str.charAt(0) + stringClean(str.substring(1));
}
