/*

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/

public String withoutX2(String str) {
  int pos = 0;
  if(str.length() > 0 && str.charAt(0) == 'x')
    str = str.substring(1);
  else
    pos++;
  if(str.length() > 0 && str.charAt(pos) == 'x')
    if(pos == 1)
      return str.charAt(0) + str.substring(2);
    else
      return str.substring(1);
  return str;
}
