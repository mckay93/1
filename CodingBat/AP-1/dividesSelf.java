public boolean dividesSelf(int n) {
  for(int val = n; val > 0; val /= 10){
    int devider = val%10;
    if(devider == 0 || n%devider != 0) return false;
  }
  
  return true;
}
