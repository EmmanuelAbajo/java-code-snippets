package com.esc.asyncprog;

class CPUWaster extends Thread {
	public void run() {
		while(true);
	}
}

public class ThreadProcessDemo {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		long usedKB = (rt.totalMemory() - rt.freeMemory()) / 1024;
		
//		System.out.println("Process ID: "+ ProcessHandle.current().pid());
		System.out.println("Thread Count: "+ Thread.activeCount());
		System.out.format("Memory usage: %d kb\n\n", usedKB);
		
		System.out.println("Starting 2 CPU waster threads...");
		for (int i=0; i<2; i++) {
			new CPUWaster().start();
		}
		
		usedKB = (rt.totalMemory() - rt.freeMemory()) / 1024;
//		System.out.println("Process ID: "+ ProcessHandle.current().pid());
		System.out.println("Thread Count: "+ Thread.activeCount());
		System.out.format("Memory usage: %d kb\n", usedKB);
	}

}
