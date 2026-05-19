import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        
        // 초기값
        int number = 0;
        int seq = 0;
        int wordCount = 1;
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            boolean stopFlag = wordList.contains(words[i]);

            // 마지막 글자와 첫번째 글자가 같은지
            if (i != 0) {
                String beforeWord = words[i - 1];
                String afterWord = words[i];

                char lastChar = beforeWord.charAt(beforeWord.length() - 1);
                char firstChar = afterWord.charAt(0);
                if(lastChar != firstChar) stopFlag = true;
            }

            if (stopFlag) {
                // 지나온 글자 개수에서 사람수 나눈 나머지가  1~n 번째 인 사람이다
                // 만약 사람수와 딱맞아서 나머지가 0이면 n 번째 인 사람이다
                // seq도 mod가 0이면 나눈 몫 에서 -1을 해주고 전체에 1을 더해주거나
                // mod가 0아니면 +1을 해준다
                int mod = wordCount % n;
                number = (mod == 0) ? n : mod;
                seq = ((mod == 0) ? (wordCount / n) -1 : wordCount / n)+1 ;

                break;
            }
            wordList.add(words[i]);
            wordCount++;
        }

        answer = new int[]{number, seq};
        return answer;
    }
}