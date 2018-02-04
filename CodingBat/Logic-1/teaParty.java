public int teaParty(int tea, int candy) {
  if(tea >= 5 && candy >= 5)
    return tea*2 <= candy || candy*2 <= tea ? 2 : 1;
  return 0;
}
