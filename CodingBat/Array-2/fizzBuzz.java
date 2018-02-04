public String[] fizzBuzz(int start, int end) {
  String result[] = new String[end-start];
  
  for(int j = start, i = 0; j < end; j++, i++){
    if(j%3 == 0 && j%5 == 0){
      result[i] = "FizzBuzz";
    }else{
      if(j%3 == 0) result[i] = "Fizz";
      else if(j%5 == 0) result[i] = "Buzz";
      else result[i] = String.valueOf(j);
    }
  }
  
  return result;
}
