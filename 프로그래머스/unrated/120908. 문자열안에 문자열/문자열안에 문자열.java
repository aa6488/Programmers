class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int count = 0;
        // contains 사용
        for(int i = 0; i<str1.length(); i++){
            if(str1.length() < str2.length()){
                answer = 2;
                break;
            }
            
            char a = str1.charAt(i);
            char b = str2.charAt(count);
            if(a == b){
                count++;
                if(count == str2.length()){
                    answer = 1;
                    break;
                }
            }else{
                count = 0;
                answer = 2;
            }
            
        }
        return answer;
    }
}