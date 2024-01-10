class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
		
        // 개수가 2개가되면 중복되는것이니 사용할변수
		int test = 0; 
		// dic 배열의 해당문자열에 문자열이 중복되는것이 있으면 삭제
		for(int i=0; i<dic.length; i++) {
			for(int j =0; j<dic[i].length(); j++) {
				char a = dic[i].charAt(j);
				test = 0;
				
				for(int k = 0; k<dic[i].length(); k++) {
					char b = dic[i].charAt(k);
					if(a == b) {
						test++;
						if(test == 2) {
							dic[i] = "";
						}
					}
				}
			}
			
		}
        
        
        
		// 밑에 a 와 spell 을 비교할때 증가시킬 변수
		int count = 0;
		
		// dic 의 배열개수만큼 반복
		for(int j = 0; j < dic.length; j++) {
			//문자열 하나당 비교한갯수 카운트 초기화
			count = 0;
			
			// dic 문자열 해당 인덱스내부의 문자열 길이만큼 반복
			// dic[j] 스트링을 캐릭터형으로 a 에 담는다
			for(int k = 0; k < dic[j].length(); k++) {
				char a = dic[j].charAt(k);
				
				// 문자열 비교할때 만약 dic의 인덱스값 스트링이  spell 의 알파벳 개수랑                  같지않으면
				// 성공조건에 부합하지않아 바로 다음 반복문으로 들어가게한다
				if(dic[j].length() != spell.length) {
					break;
				}
					// spell 문자열 만큼 반복  
					// char 형으로 바꾼 값들을 spell 과 비교
					for(int i =0; i<spell.length; i++) {
							
						// 같으면 카운트 1증가
						if(spell[i].equals(a+"")) {
							count++;
							
							// 만약 카운트가 spell 길이와 같으면 문자가 하나씩 들어가                                있게되는것이니
							// answer = 1이다 
							if(count == spell.length) {
								answer = 1;
							}
						}
						
					}
				
				
			}
		}
        return answer;
    }
}