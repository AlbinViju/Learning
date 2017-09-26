package com.quest.multithread;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
	
	List<Integer> sharedQueue = new ArrayList<Integer>();
	
	public Consumer(List<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while(true){
			try {
				consume();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private void consume() throws InterruptedException {
		synchronized (sharedQueue) {
			while(sharedQueue.size() == 0);
			System.out.println("Queue is empty");
			sharedQueue.wait();
		}
		
		synchronized (sharedQueue) {
			Thread.sleep(1000);
			System.out.println("Consumed :"+sharedQueue.remove(0));
			sharedQueue.notify();
		}
		
	}

}
