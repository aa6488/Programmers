import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        // Map<맞은개수, 등수>
        Map<Integer, Integer> ranking = new HashMap<>();
        ranking.put(6, 1);
        ranking.put(5, 2);
        ranking.put(4, 3);
        ranking.put(3, 4);
        ranking.put(2, 5);
        ranking.put(1, 6);
        ranking.put(0, 6);

        // 맞은개수
        int correctCount = 0;
        int zeroCount = 0;

        // 번호중 이미 맞은번호 카운트 후 0개수로 다 맞았다고 가정, 다틀렸다고 가정후 등수계산
        for (int i : lottos) {
            if (i != 0) {
                for (int j : win_nums) {
                    if(i == j) correctCount++;
                }
            }else{
                zeroCount++;
            }
        }

        int bestRank = ranking.get(correctCount + zeroCount);
        int worstRank = ranking.get(correctCount);

        answer = new int[]{bestRank, worstRank};
        return answer;
    }
}