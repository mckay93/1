public String getSandwich(String str) {
  int firstBread = str.indexOf("bread");
  int secondBread = str.lastIndexOf("bread");
  
  if(firstBread == secondBread) return "";
  return str.substring(firstBread + 5, secondBread);
}
