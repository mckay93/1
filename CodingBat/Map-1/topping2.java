public Map<String, String> topping2(Map<String, String> map) {
  if(map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));
  if(map.containsKey("spinach")){
    if(map.get("spinach").length() > 0) map.put("spinach", "nuts");
  }
  return map;
}
