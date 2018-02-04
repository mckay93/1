public int maxMirror(int[] nums) {
  List<Integer> origin = new ArrayList<>();
  List<Integer> reverse = new ArrayList<>();
  int maxMirror = 0;
  
  for (int mainLoop = 0; mainLoop < nums.length; mainLoop++){
      for (int i = 1 + mainLoop; i <= nums.length; i++){
          for (int j = mainLoop; j < i; j++) origin.add(nums[j]);
          for (int j = nums.length - 1; j >= 0; j--){
              int borderPos = j - (origin.size() - 1);
              if (borderPos < 0) continue;
              for (int k = j; k >= borderPos; k--) reverse.add(nums[k]);
              if (origin.equals(reverse)) maxMirror = origin.size() > maxMirror ? origin.size() : maxMirror;
              reverse.clear();
          }
          origin.clear();
      }
  }
  
  return maxMirror;
}
