public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}
public int round10(int num){
	if(num%10 < 5) 
	  return (int)(num/10.) * 10;
	return (int)Math.ceil(num/10.) * 10;
}
