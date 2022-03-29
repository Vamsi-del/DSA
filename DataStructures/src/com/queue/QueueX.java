package com.queue;

//import com.sun.javafx.scene.control.skin.ComboBoxPopupControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class QueueX {
    public static void main(String[] args) throws IOException {
        QueueX queueX = new QueueX();
//        Queue queue =new Queue(2,-1,0,0);
//        queue.insert(8);
//        queue.insert(9);
//        System.out.println(queue.isFull());
//        System.out.println(queue.size());
//        System.out.println(queue.peek());
//        while (!queue.isEmpty()) {
//            System.out.println(queue.remove());
//        }
//        System.out.println(queue.size());
//
//        CircularQueue circularQueue =new CircularQueue(2,-1,0,0);
//        circularQueue.add(8);
//        circularQueue.add(7);
//        circularQueue.add(9);
//        while(!circularQueue.isEmpty()) {
//            System.out.println(circularQueue.remove());
//        }
//        Dequeue dequeue = new Dequeue(10,-1,-1);
//        dequeue.enqueueFront(3);
//        dequeue.enqueueFront(6);
//        dequeue.enqueueRear(1);
//        dequeue.enqueueFront(8);
//        dequeue.enqueueRear(10);
//        dequeue.display();
//        dequeue.dequeueFront();
//        dequeue.dequeueFront();
//        dequeue.dequeueRear();
//        dequeue.dequeueRear();
//        SupermarketStimulation supermarketStimulation = new SupermarketStimulation();
//        supermarketStimulation.customersInLine();
//        Customers customers = new Customers(10);
//        Random random = new Random();
//        String[] names = {"Ravi","Surya","Ram","Vasil","Krishna","Royal","kola","Geetha","Sita","Vasai"};
//        while (true) {
//            System.out.println("Enter Customer Name");
//            System.out.flush();
//            String name = queueX.name();
//            System.out.println("No of Item purchased");
//            System.out.flush();
//            String groceries = queueX.noOfItem();
//            if (name.equals("") && groceries.equals("")){
//                break;
//            }
//            else{
//                customers.insert(name,groceries);
//                customers.remove();
//            }
//        }
//
        ListQueue listQueue = new ListQueue();
        listQueue.add(20);
        listQueue.add(40);
        listQueue.add(60);
        listQueue.add(80);
        listQueue.displayQueue();
//        listQueue.remove();
//        listQueue.remove();
//        listQueue.displayQueue();
    }
//
//    private String noOfItem() {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        try {
//            String s = br.readLine();
//            return s;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "";
//    }
//
//    public String name(){
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        try {
//            String s = br.readLine();
//            return s;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "";
//    }
}
