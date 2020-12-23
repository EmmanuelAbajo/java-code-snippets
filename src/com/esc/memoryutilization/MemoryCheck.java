package com.esc.memoryutilization;

public class MemoryCheck {

	public void memCheck() {
		Runtime runtime = Runtime.getRuntime();
		long memoryMax = runtime.maxMemory();
		long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
		double memoryUsedPercent = (memoryUsed * 100.0) / memoryMax;
		
		System.out.println("JRE max memory: "+ memoryMax);
		System.out.println("JVM total memory: "+ runtime.totalMemory()/1000000 + "mb");
		System.out.println("JVM free memory: "+ runtime.freeMemory()/1000000 + "mb");
		System.out.println("memoryUsedPercent: " + memoryUsedPercent);
		System.out.println(runtime.availableProcessors());  
//		if (memoryUsedPercent > 90.0)
//			System.gc();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryCheck check = new MemoryCheck();
		check.memCheck();

	}

}
