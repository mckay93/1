public String frontTimes(String str, int n) {
  String result = "";
  for(int i = 0; i < n; i++)
    result += str.length() > 3 ? str.substring(0, 3) : str;
  return result;
}
