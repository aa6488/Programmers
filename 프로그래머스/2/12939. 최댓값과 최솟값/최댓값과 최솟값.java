class Solution {
    public String solution(String s) {
        String answer = "";
		String[] a = s.split(" ");
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		
		int max = b[0];
		int min = b[0];
		
		for(int i=0; i<b.length; i++) {
			if(max < b[i]) {
				max = b[i];
			}
			if(min > b[i]) {
				min = b[i];
			}
		}
		
		answer = (String)(min+" "+max);
		
        return answer;
    }
}