package execption;

public class UserDefinedExceptionDemo {
	static void compute (int a) throws UserDefinedExecption{
		System.out.println("called compute (" + a + " )" );
	
	if(a > 10)
	{
	 throw new UserDefinedExecption("value more than 10");
	}
	System.out.println("normal exit");
	}
	public static void main(String[] args) {
		try {
			compute(2);
			compute(30);
			
		}
		catch(UserDefinedExecption e)
		{
			e.printStackTrace();
			System.out.println("caught " + e);
		}
	}

}
