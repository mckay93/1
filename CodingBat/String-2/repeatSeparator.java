public String repeatSeparator(String word, String sep, int count) {
  String[] words = new String[count];
  Arrays.fill(words, word);
  return String.join(sep, words);
}
