package com.priorityQueues;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class PriorityQ {
    public static void main(String[] args) {
//        PriorityQueue priorityQueue = new PriorityQueue(10,0);
//        priorityQueue.insert(20);
//        priorityQueue.insert(10);
//        priorityQueue.insert(50);
//        priorityQueue.insert(80);
//        priorityQueue.insert(70);
//        while(!priorityQueue.isEmpty()){
//            System.out.println(priorityQueue.remove());
//        }
        FastInsertion fastInsertion = new FastInsertion(5,0);
        fastInsertion.insert(200);
        fastInsertion.insert(60);
        fastInsertion.insert(10);
        fastInsertion.insert(20);
        fastInsertion.insert(50);
        while (!fastInsertion.isEmpty()){
            fastInsertion.remove();
        }
    }
}
