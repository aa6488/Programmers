class Solution {
    public int solution(int i, int j, int k) {
        String kk = k+"";
		int answer = 0;
		
		for(int t = i; t<=j; t++) {
			String[] a = String.valueOf(t).split("");
			for(int q = 0; q<a.length; q++) {
				if(a[q].equals(kk)) {
					answer++;
				}
			}
		}
        return answer;
    }
}