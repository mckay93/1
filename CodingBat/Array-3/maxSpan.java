public int maxSpan(int[] nums) {
  HashMap<Integer, Integer> numbers = new HashMap<>();
  final int counter[] = new int[1];
  counter[0] = 0;
  
  for(int n : nums){
    if(!numbers.containsKey(n)){
      numbers.put(n, 1);
    }else{
      int count = numbers.get(n);
      numbers.put(n, ++count);
    }
  }
  
  numbers.forEach((k,v) -> {
    int first = -1;
    int last = 0;
    int span = 0;
    
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == k && first == -1) first = i;
      if(nums[i] == k && first > -1) last = i;
    }
    
    span = last - first + 1;
    if(span > counter[0]) counter[0] = span;
  });
  
  return counter[0];
}
