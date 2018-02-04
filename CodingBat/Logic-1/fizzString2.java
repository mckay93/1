public String fizzString2(int n) {
  String s = "";
  if(n%3 == 0) s += "Fizz";
  if(n%5 == 0) s += "Buzz";
  s += s.length() == 0 ? n + "!" : "!";
  return s;
}
