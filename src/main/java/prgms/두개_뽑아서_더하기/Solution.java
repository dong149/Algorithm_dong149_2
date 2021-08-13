package prgms.두개_뽑아서_더하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


/*
정수 배열 numbers가 주어집니다.
numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 */
class Solution {

    Set<Integer> resultSet = new HashSet<>();

    public int[] solution(int[] numbers) {
        addResultToSet(numbers);
        List<Integer> resultList = new ArrayList<>(resultSet);
        return resultList.stream().sorted().mapToInt(i -> i).toArray();
    }

    void addResultToSet(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            sum += numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
                resultSet.add(sum);
                sum -= numbers[j];
            }
            sum -= numbers[i];
        }
    }

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7}, solution(new int[]{2, 1, 3, 4, 1}));
    }
}
