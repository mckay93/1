public boolean makeBricks(int small, int big, int goal) {
  big *= 5;
  return ((big == goal || small >= goal) ||
    (big > goal && goal%5 <= small) ||
    (big < goal && goal - big <= small));
}
