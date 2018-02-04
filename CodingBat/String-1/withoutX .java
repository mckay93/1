/*

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/

public String withoutX(String str) {
  int sLength = str.length();
  if(sLength == 0) return str;
  if(sLength == 1)
    return str.charAt(0) == 'x' ? "" : str;
  if(str.charAt(0) == 'x' && str.charAt(sLength-1) != 'x')
    return str.substring(1);
  if(str.charAt(0) != 'x' && str.charAt(sLength-1) == 'x')
    return str.substring(0, sLength-1);
  if(str.charAt(0) == 'x' && str.charAt(sLength-1) == 'x')
    return str.substring(1, sLength-1);
  return str;
}
