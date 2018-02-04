public boolean twoTwo(int[] nums) {
  List<Integer> indexes = new ArrayList<>();
  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2) indexes.add(i);
  }
  
  if(indexes.size() == 1) return false;
  for(int i = 0; i < indexes.size()-1; i++){
    if(indexes.get(i+1) - indexes.get(i) != 1) return false;
  }
  
  return true;
}
