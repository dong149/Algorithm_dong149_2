package practice.큐_두개로_스택_구현하기;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println(pop());
        push(2);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());


    }

    static void push(int num){
        q1.add(num);
    }
    static Integer pop(){
        if(q1.isEmpty())
            return null;
        while(!(q1.size()==1)){
            q2.add(q1.poll());
        }

        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }

        return q1.poll();
    }

}
