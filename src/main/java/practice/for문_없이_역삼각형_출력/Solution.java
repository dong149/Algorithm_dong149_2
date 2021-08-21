package practice.for문_없이_역삼각형_출력;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * for문 없이 역삼각형 출력하기
 */
public class Solution {

    StringBuilder sb = new StringBuilder();

    String solution(int height) {
        printReverseTriangle(height);
        return sb.toString();
    }


    void printReverseTriangle(int height) {
        if (height == 0)
            return;
        printRow(height);
        sb.append('\n');
        printReverseTriangle(height - 1);
    }


    void printRow(int num) {
        if (num == 0)
            return;
        sb.append(1);
        printRow(num - 1);
    }


    @Test
    void test() {
        String res1 = "1111\n111\n11\n1\n";
        Assertions.assertEquals(res1, solution(4));

    }
}
