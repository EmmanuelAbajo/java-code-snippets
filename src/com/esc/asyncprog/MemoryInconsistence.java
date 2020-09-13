package com.esc.asyncprog;

// Solution: When a thread modifies a shared variable, it becomes visible to other threads using
// the variable. The volatile keyword is used to achieve that.
public class MemoryInconsistence {
	
	private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
           while(!flag) {}
           System.out.println("Hello World!");

           while(flag) {}
           System.out.println("Good Bye!");
        }).start();
 
        Thread.sleep(1000);
        System.out.println("Say Hello..");
        flag = true;

        Thread.sleep(1000);
        System.out.println("Say Bye..");
        flag = false;
    }

}
