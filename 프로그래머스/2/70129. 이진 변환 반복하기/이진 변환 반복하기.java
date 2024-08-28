class Solution {
    public int[] solution(String s) {
        // 전체 0 개수
        int totalCount = 0;
        
        // 이진 전환 수
        int resultCount = 0;
        
        // result 담을 변수
        int[] answer = new int[2];

        // String 을 2진수로 변환하기위한 s.length() - count 만큼 1을 추가한 변수
        String result = "";
        // 반복문 index
        int index = 0;
        // 반복문 내부 0의 개수
        int count = 0;
        
        // s문자열이 1일때까지
        while(!s.equals("1")){

            // 0이면 증가
            if (s.charAt(index) == '0') {
                totalCount++;
                count++;
            }
            index++;

            // index 가 s.legnth()와 같으면 배열반복 다한것이라 초기화
            if (index == s.length()) {
                resultCount++;
                // 0을 제외한 남은 길이만큼 1씩 문자열 붙이기
                for(int i=0; i<s.length()-count; i++){
                    result += "1";
                }
                // result의 length 를 2진수로 변환
                s = Integer.toBinaryString(result.length());
                result = "";
                count = 0;
                index = 0;

            }
        }
        answer[0] = resultCount;
        answer[1] = totalCount;
        return answer;
    }
}