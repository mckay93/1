public int sumNumbers(String str) {
  String number = "";
  int sum = 0;
  
  for(int i = 0; i < str.length(); i++){
    char c = str.charAt(i);
    if(Character.isDigit(c)){
      number += String.valueOf(c);
    }else{
      if(!number.isEmpty()){
        sum += Integer.parseInt(number);
        number = "";
      }
    }
  }
  
  if(!number.isEmpty()){
    sum += Integer.parseInt(number);
  }
  
  return sum;
}
