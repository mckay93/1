public int userCompare(String aName, int aId, String bName, int bId) {
  int result = aName.compareTo(bName);
  if(result == 0){
    if(aId > bId) return 1;
    if(aId < bId) return -1;
    return 0;
  }
  
  return result < 0 ? -1 : 1;
}
