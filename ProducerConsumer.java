package com.quest.multithread;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	public static void main(String[] args) {
		List<Integer> sharedQueue = new ArrayList<Integer>();  
        Producer producer = new Producer(sharedQueue);  
        Consumer consumer = new Consumer(sharedQueue);  
        Thread p = new Thread(producer, "Producer Thread");  
        Thread c = new Thread(consumer, "Consumer Thread");  
        p.start();  
        c.start();
		

	}

}
