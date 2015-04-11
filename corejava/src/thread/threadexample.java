package thread;

public class threadexample {

	public static void main (String[] args)
	{
		System.out.println(Thread.currentThread().getName());
	    Thread2 horse1 = new Thread2("badal");
	    Thread2 horse2 = new Thread2("raka");
	    Thread badalThread = new Thread(horse1,"badal");
	    badalThread.start();
	    //horse1.start();
	    //horse2.run();
	    Thread rakaThread = new Thread(horse2,"raka");
	    rakaThread.start();
	    System.out.println("i am done !!!!!");
	    
	}   
	
}
