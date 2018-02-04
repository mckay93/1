public boolean has77(int[] nums) {
  List<Integer> sevens = new ArrayList<>();
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 7) sevens.add(i);
  }
  for(int i = 1; i < sevens.size(); i++){
    if(sevens.get(i) - sevens.get(i-1) <= 2) return true;
  }
  return false;
}
