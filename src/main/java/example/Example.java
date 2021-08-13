package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



/*
 JAVA 문제 풀이시, Test 방법 예시
 */


public class Example {

    public long solution(int w, int h) {
        return w+h;
    }

    @Test
    public void 정답(){
        Assertions.assertEquals(20,solution(10,10));
        Assertions.assertEquals(20,solution(8,12));
    }
}
