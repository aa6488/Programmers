import java.util.ArrayList;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
		int count = 0;
		
		ArrayList<String> test = new ArrayList<>();
		for(int i = 0; i<after.length(); i++) {
			test.add(after.split("")[i]);
		}
		
		for(int i = 0; i<before.length(); i++) {
			char a = before.charAt(i);
			String b = Character.toString(a);
				for(int j = 0; j<test.size(); j++) {
					if(b.equals(test.get(j))) {
						count++;
						test.remove(j);
						break;
					}
				}
			if(count == before.length()) {
				answer = 1;
				break;
			}
				
		}
        return answer;
    }
}