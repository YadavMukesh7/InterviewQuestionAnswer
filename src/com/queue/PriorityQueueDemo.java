package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pr = new PriorityQueue();
        System.out.println(pr.poll());
//        System.out.println(pr.remove());
        for (int i = 0; i < 10; i++) {
            pr.offer(i);
        }
        System.out.println(pr.peek());
        System.out.println(pr.element());
        System.out.println(pr);
    }
}
