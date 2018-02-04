/*

Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
*/

public String startWord(String str, String word) {
  int wLength = word.length();
  if(str.length() < wLength) return "";
  if(wLength == 1) return String.valueOf(str.charAt(0));
  return str.substring(1, wLength)
    .equals(word.substring(1)) ? str.substring(0, wLength) :
    "";
  
}
