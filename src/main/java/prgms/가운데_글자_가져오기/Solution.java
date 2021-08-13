package prgms.가운데_글자_가져오기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    public String solution(String s) {
        String answer = "";

        int len = s.length();
        if (len % 2 == 0) {
            answer += s.charAt(len / 2 - 1);
            answer += s.charAt(len / 2);
        } else {
            answer += s.charAt(len / 2);
        }
        return answer;
    }

    @Test
    void test(){
        Assertions.assertEquals("s",solution("aasaa"));
        Assertions.assertEquals("sa",solution("asaa"));
    }
}
