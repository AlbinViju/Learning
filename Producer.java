package com.quest.multithread;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{
	List<Integer> sharedQueue = new ArrayList<Integer>();  
    public Producer(List<Integer> sharedQueue) {  
         this.sharedQueue = sharedQueue;  
    }  
    public void run() {  
         for (int i = 1; i<=10; i++) {  
              try {  
                   produce(i);  
              } catch(InterruptedException e) {  
                   e.printStackTrace();  
              }  
         }  
    }  
    private void produce(int i) throws InterruptedException{  
         synchronized (sharedQueue) {  
              if (sharedQueue.size() == 1) {  
                   System.out.println("Queue is full");  
                   sharedQueue.wait();  
              }  
         }  
         synchronized (sharedQueue) {  
              System.out.println("Produced : "+i);  
              sharedQueue.add(i);  
              Thread.sleep(1000);  
              sharedQueue.notify();  
         }  
    } 

}
