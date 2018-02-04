public int scoresAverage(int[] scores) {
  int mid = scores.length / 2;
  int left = average(scores, 0, mid);
  int right = average(scores, mid, scores.length);
  
  return left > right ? left : right;
}
public int average(int[] scores, int start, int end){
  if(end - start == 0) return scores[start];
  int avg = 0;
  for(int i = start; i < end; i++) avg += scores[i];
  return avg / (end - start);
}
