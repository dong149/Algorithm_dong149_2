package practice.문자열_수식_계산하기;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *  문자열 수식 계산하기
 */

public class Solution {

    int solution(String str){
        List<Integer> valList = new ArrayList<>();
        List<Character> opList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str,"+*-",true);
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.matches("[+*-]+"))
                opList.add(token.charAt(0));
            else
                valList.add(Integer.parseInt(token));
        }
        for(int i=0;i<opList.size();i++){
            char curOp = opList.get(i);
            if(curOp=='*'){
                valList.set(i,valList.get(i) * valList.get(i+1));
                valList.remove(i+1);
                opList.remove(i);
                i--;
            }
            System.out.println(valList.toString());
            System.out.println(opList.toString());
        }

        for(int i=0;i<opList.size();i++){
            char curOp = opList.get(i);
            if(curOp=='+'){
                valList.set(i,valList.get(i) + valList.get(i+1));
                valList.remove(i+1);
                opList.remove(i);
                i--;
            }else if(curOp=='-'){
                valList.set(i,valList.get(i) - valList.get(i+1));
                valList.remove(i+1);
                opList.remove(i);
                i--;
            }
            System.out.println(valList.toString());
            System.out.println(opList.toString());
        }


        return valList.get(0);




    }



    @Test
    void test(){
        Assertions.assertEquals(109,solution("3*4+4+4+10*9-1"));
        Assertions.assertEquals(10,solution("3+4*4-9"));

    }


}
