package arrayCompare;

import java.util.Random;

public class thread implements Runnable{
	Random rd = new Random();
	final int max = 200000000;
	int[] array = new int[max];
	int total = 0;
	
	String name;

	public thread(String x) {
		name = x;
		for(int i = 0; i < max; i++) {
			array[i] = rd.nextInt(10);
			total += array[i] + 1;
		}
	}
	public void run() {
		try {
			System.out.println(total);
		}catch(Exception e) {}
	}
}