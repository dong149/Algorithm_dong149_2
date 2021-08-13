package prgms.약수의_개수와_덧셈;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int factorCount = getFactorCount(i);
            if (factorCount % 2 == 1)
                answer -= i;
            else
                answer += i;

        }
        return answer;
    }

    int getFactorCount(int num) {
        int factorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factorCount++;
        }
        return factorCount;
    }


    @Test
    void test() {
        Assertions.assertEquals(43, solution(13, 17));
        Assertions.assertEquals(52, solution(24, 27));
    }
}
