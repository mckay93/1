public String[] wordsWithout(String[] words, String target) {
  String result[] = new String[words.length];
  int position = 0;
  
  for(int i = 0; i < words.length; i++){
    if(!words[i].equals(target)) result[position++] = words[i];
  }
  
  return Arrays.copyOf(result, position);
}
