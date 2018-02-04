public String fizzString(String str) {
  String s = "";
  if(str.length() == 0) return str;
  if(str.charAt(0) == 'f') s += "Fizz";
  if(str.charAt(str.length()-1) == 'b') s += "Buzz";
  if(s.length() != 0) str = s;
  return str;
}
