package arrayCompare;

import java.util.concurrent.TimeUnit;

public class parallel {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new thread("array"));
		t1.start();
		/*
		Thread t2 = new Thread(new thread("array2"));
		Thread t3 = new Thread(new thread("array3"));
		Thread t4 = new Thread(new thread("array4"));
		Thread t5 = new Thread(new thread("array5"));
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		*/
		
		long startTime = System.nanoTime();
		TimeUnit.SECONDS.sleep(1);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println(timeElapsed/1000000 + " milliseconds");
	}
}