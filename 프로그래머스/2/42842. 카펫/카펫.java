class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        /*block 개수  brown,   yellow
        brown =  width  height      w, h
        yellow (b) =  (w-2) * (h-2)
        전체넓이   wh
        brown 개수 =  wh - (w-2) * (h-2) */

        // 임의의 노란부분 높이를 정해서 1부터 반복
        // innerH * innerH <= yellow 범위는 가로,세로 구할때 가로*세로 기준 같은수 곱했을때 이하인수와 이상은 순서만 바뀐 중복이라
        for (int innerH = 1; innerH * innerH <= yellow; innerH++) {

            // innerH 가 yellow 의 약수가아니면 innerH++
            if(yellow % innerH != 0) continue;

            // innerH 는 항상 innerW 보다 작거나 같게됨  위에 innerH의 범위를 for문에 지정했기때문에
            int innerW = yellow / innerH;

            // 전체길이는 각각 외곽에 노란색 + 갈색개수 양쪽2개 이기때문에 outer 가로세로는 기존 안에 노란색 가로세로 +2
            int outerW = innerW + 2;
            int outerH = innerH + 2;

            // 추정해서 구한 block 의 개수  (전체 - 내부 노란색크기)
            int brownBlock = (outerW * outerH) - (innerW * innerH);
            if (brownBlock == brown) {
                answer = new int[]{outerW, outerH};
                answer[1] = outerH;
            }

        }

        return answer;
    }
}