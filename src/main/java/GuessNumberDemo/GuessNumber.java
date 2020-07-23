package GuessNumberDemo;

public class GuessNumber {

    public String play(int[] answer, int[] inputNumbers) {
        if (is4A0B(answer, inputNumbers)) return "4A0B";
        if (is0A0B(answer, inputNumbers)) return "0A0B";
        if (isXA0B(answer, inputNumbers)) {
            int A = findA(answer , inputNumbers);
            return String.valueOf(A) + "A0B";
        }
        if(is0AXB(answer,inputNumbers)){
            int B = findB(answer, inputNumbers);
            return "0A" + String.valueOf(B) + "B";
        }
        if(isXAXB(answer,inputNumbers)){
            int A = findA(answer, inputNumbers);
            int B = findB(answer,inputNumbers);
            return String.valueOf(A) + "A" + String.valueOf(B) + "B";
        }
        return null;
    }

    private boolean isXAXB(int[] answer, int[] inputNumbers) {
        int A = findA(answer, inputNumbers);
        int B = findB(answer, inputNumbers);
        if(A != 0 && B != 0)
            return true;
        return false;
    }

    private boolean is0AXB(int[] answer, int[] inputNumbers) {
        int A = findA(answer, inputNumbers);
        int B = findB(answer, inputNumbers);
        if(A == 0 && B != 0)
            return true;
        return false;
    }

    private boolean isXA0B(int[] answer, int[] inputNumbers) {
        int[] flag = new int[10];
        int A = findA(answer, inputNumbers);
        int B = findB(answer, inputNumbers);
        if(A != 0 && B == 0) return true;
        return false;
    }

    private int findB(int[] answer, int[] inputNumbers) {
        int B = 0;
        int [] base = new int[10];
        for(int i = 0; i < answer.length; i ++){
                if(answer[i] != inputNumbers[i]){
                    base[answer[i]] ++;
                    base[inputNumbers[i]] ++;
                }
        }
        for(int num : base){
            if(num == 2) B ++;
        }
        return B;
    }

    private int findA(int[] answer, int[] inputNumbers) {
        int A = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == inputNumbers[i]) A++;
        }
        return A;
    }


    private boolean is0A0B(int[] answer, int[] inputNumbers) {
        int A = findA(answer,inputNumbers);
        int B = findB(answer, inputNumbers);
        if(A == B && A == 0)
            return true;
        return false;
    }

    private boolean is4A0B(int[] answer, int[] inputNumbers) {
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != inputNumbers[i]) return false;
        }
        return true;
    }


}
