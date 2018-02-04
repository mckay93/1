public String changePi(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(str.length() - 1) == 'i'){
    if(str.length() >= 2 && str.charAt(str.length() - 2) == 'p'){
      return changePi(str.substring(0, str.length()-2)) + "3.14";
    }
  }
  return changePi(str.substring(0, str.length()-1)) + str.charAt(str.length()-1);
}
