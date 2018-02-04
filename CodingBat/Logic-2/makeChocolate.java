public int makeChocolate(int small, int big, int goal) {
  big *= 5;
  if(big > goal) return goal%5 <= small ? goal%5 : -1;
  return goal - big <= small ? goal - big : -1;
}
