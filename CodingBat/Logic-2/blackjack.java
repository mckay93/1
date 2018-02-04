public int blackjack(int a, int b) {
  if(a <= 21 && (21 - a <= 21 - b)) return a;
  if(b <= 21 && (21 - b <= 21 - a)) return b;
  if(a > 21) return b > 21 ? 0 : b;
  if(b > 21) return a;
  return 0;
}
