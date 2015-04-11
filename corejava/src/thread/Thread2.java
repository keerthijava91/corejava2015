package thread;
//extends thread class 
public class Thread2 implements Runnable {
	String name ;
	public Thread2(String name){
		this.name = name;
		//super(name);
		//set name and then we getname in sop
	}

	public void run()
	{
		for(int i=0;i<5;i++){
		System.out.println("Thread2 is running in >>>>" + name + "[" + i + "]"+ " "+ Thread.currentThread().getName());
	}
	
	}
	

}
