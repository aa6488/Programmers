class Solution {
    public int solution(String dartResult) {
        int one = 0,two = 0,three = 0;
        int count = 1;
        int answer = 0;

        int num = 0;

        for (int i = 0; i < dartResult.length(); i++) {

            char c = dartResult.charAt(i);


            if (Character.isDigit(c)) {
                String test = "";

                if (i != 0) {

                    // 숫자 10 일때 대비
                    char c1 = dartResult.charAt(i - 1);
                    if (Character.isDigit(c1)){
                        test = String.valueOf(c1)+String.valueOf(c);
//                        test = String.valueOf(c1 + c);
                    }else{
                        test = String.valueOf(c);
                    }
                } else {
                    test = String.valueOf(c);
                }

                num = Integer.parseInt(test);
                test = "";
            } else if (Character.isLetter(c)) {
                if (c == 'S') {
                    num = num;
                } else if (c == 'D') {
                    num *= num;
                } else if (c == 'T') {
                    num *= num*num;
                }

                if (count == 1) {
                    one = num;
                } else if (count == 2) {
                    two = num;
                } else if (count == 3) {
                    three = num;
                }

                // 다음 특수문자 아닐때 null 초기화용
                // dartResult 길이 초과 x
                if (dartResult.length() > i + 1) {
                    char c1 = dartResult.charAt(i + 1);
                    if (Character.isDigit(c1)) {
                        num = 0;
                        count++;
                    }
                }
            }else{
                if (c == '*') {
                    num *= 2;
                    if (count == 1) {
                        one = num;
                    } else if (count == 2) {
                        one *=2;
                        two = num;
                    } else if (count == 3) {
                        two *=2;
                        three = num;
                    }

                    num = 0;
                } else if (c == '#') {
                    num = -num;
                    if (count == 1) {
                        one = num;
                    } else if (count == 2) {
                        two = num;
                    } else if (count == 3) {
                        three = num;
                    }

                }
                num = 0;
                count++;
            }


        }


        answer = one+two+three;

        return answer;
    }
}