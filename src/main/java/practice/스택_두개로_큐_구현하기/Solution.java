package practice.스택_두개로_큐_구현하기;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {


    public static void main(String[] args) {
        push(3);
        System.out.println(stack1);
        System.out.println(stack2);
        push(4);
        System.out.println(stack1);
        System.out.println(stack2);
        push(5);
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(pop());
        System.out.println(stack1);
        System.out.println(stack2);
        push(6);
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());

    }


    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    static void push(int n){
        stack1.push(n);
    }

    static Integer pop(){
        int pop;
        if(stack2.isEmpty()){
            if(stack1.isEmpty())
                return null;
            while(!stack1.isEmpty()){
                int poppedFromStack1 = stack1.pop();
                stack2.push(poppedFromStack1);
            }
            pop = stack2.pop();
        }else
            pop = stack2.pop();

        return pop;
    }

}
