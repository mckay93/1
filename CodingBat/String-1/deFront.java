/*

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

public String deFront(String str) { 
  String result = "";
  int l = str.length();
  if(l == 0) return str;
  if(l == 1)
    return str.equals("a") ? str : "";
  if(l >= 2){
    if(str.charAt(0) == 'a')
      result += "a";
    if(str.charAt(1) == 'b')
      result += "b";
  }
  return result + str.substring(2);
}
