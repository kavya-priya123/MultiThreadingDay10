package ai.jobiak.threads;
//Concurrent/Multithreading programming-
//Parallel Programming-
//Thread is an Object,it is a type and extends Object->used for optimum CPU Utilization
//Threads make Java Platform dependent

public class TestThreads {

	public static void main(String[] args) {
		
       System.out.println("started main......");
       MyThread t1= new MyThread("t1");
       MyThread t2= new MyThread("t2");
       
       //t1.setDaemon(true);
       //t2.setDaemon(true);
       t1.run();//It will on the same stack as main method
       t2.run();
       t1.start();
       t2.start();
       System.out.println("exiting main......");
	}

}
