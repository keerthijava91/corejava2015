package execption;

public class Trycatchexample {

	public static void main(String[] args) {
		int returnvalue= add(0,0);
		System.out.println("before calculation");
		int finalvalue=0;
		try{
	    finalvalue = add(10,10)/returnvalue;
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
			finalvalue=10;
			
		}
		
		System.out.println("finalvalue =" + finalvalue);
		 returnvalue= add(5,5);
		 finalvalue = add(10,10)/returnvalue;
		System.out.println("finalvalue =" + finalvalue);
		classexecption(finalvalue ,null);
	}
	

	public static int add(int a ,int b)
	{
		return a+b;
		
	}
	public static void classexecption( int tax , String name)
	{
		if(name==null)
		{
			name = " keerthi";
			
		}
		System.out.println(name.toUpperCase() +" the tax is "+tax );
	}

}
