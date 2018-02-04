public int[] copyEndy(int[] nums, int count) {
  int result[] = new int[count];
  int position = 0;
  
  for(int i = 0; position < count; i++){
    if(isEndy(nums[i])) result[position++] = nums[i];
  }
  
  return result;
}
public boolean isEndy(int n){
  return (n >= 90 && n <= 100) || (n >= 0 && n <= 10);
}