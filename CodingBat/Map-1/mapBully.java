public Map<String, String> mapBully(Map<String, String> map) {
  String tmp = "";
  if(map.containsKey("a")){
    if(!map.get("a").equals("")){
      tmp = map.get("a");
      map.put("a", "");
    }
  }
  if(tmp.length() != 0) map.put("b", tmp);
  return map;
}
