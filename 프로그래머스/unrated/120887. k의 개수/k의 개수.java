class Solution {
    public int solution(int i, int j, int k) {
        // k 를 문자열로 변경
        String kk = k+"";
		int answer = 0;
		
		for(int t = i; t<=j; t++) {
            // 두자리 수 일수도 있기때문에 스트링으로 만든뒤 공백으로 split 한다.
			String[] a = String.valueOf(t).split("");
            // 배열로 자른 a 를  a의 길이만큼 반복해서 kk와 같을시 answer 를 +한다
			for(int q = 0; q<a.length; q++) {
				if(a[q].equals(kk)) {
					answer++;
				}
			}
		}
        return answer;
    }
}