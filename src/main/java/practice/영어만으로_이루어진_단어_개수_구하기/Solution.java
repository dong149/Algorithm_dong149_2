package practice.영어만으로_이루어진_단어_개수_구하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {


    Set<String> englishWordSet = new HashSet<>();

    int getEnglishWordCount(String sentence){

        StringTokenizer st = new StringTokenizer(sentence);
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.matches("[a-zA-Z]+"))
                englishWordSet.add(token);
        }

        return englishWordSet.size();
    }


    @Test
    void test(){
        Assertions.assertEquals(6,getEnglishWordCount("i want to be a 선생님 아as 어어어 asf"));
    }
}
