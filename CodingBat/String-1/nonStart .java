/*

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/

public String nonStart(String a, String b) {
  if(a.length() < 1 && b.length() < 1){
    return "";
  }
  if(a.length() < 1 && b.length() > 1){
    return a+b.substring(1,b.length());
  }
  if(b.length() < 1 && a.length() > 1){
    return a.substring(1,a.length())+b;
  }
  return a.substring(1,a.length()) + 
    b.substring(1,b.length());
}
