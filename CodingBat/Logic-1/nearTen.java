public boolean nearTen(int num) {
  int tmp = num % 10;
  return tmp == 0 || tmp <= 2 || tmp >= 8;
}
