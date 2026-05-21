import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;


        int firstIndex = 0;
        // firstIndex 는 처음시작 인덱스로 10개씩 체크해야하니까 discount.length-10 까지만 반복하게
        while (firstIndex <= discount.length-10) {
            Map<String, Integer> discountMap = new HashMap<>();
            boolean sameFlag = true;

            // 10개만 반복하게
            for (int i = firstIndex; i < firstIndex+10; i++) {
                String discountItem = discount[i];

                if(discountMap.containsKey(discountItem)){
                    discountMap.replace(discountItem, discountMap.get(discountItem) + 1);
                }else{
                    discountMap.put(discountItem, 1);
                }
            }

            // 10개에서 다 살수있는지
            for (int i = 0; i < want.length; i++) {
                if(!discountMap.containsKey(want[i]) || discountMap.get(want[i]) != number[i]) sameFlag = false;

            }
            if(sameFlag) answer++;
            firstIndex++;
        }
        return answer;
    }
}