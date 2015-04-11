package execption;

public class UserDefinedExecption extends Exception {
	//instance variable
	private String details ;
	//constructor
	public UserDefinedExecption(String details)
	{
		this.details = details;
		
	} 
	//tostring method to print the object
	@Override
	 public String toString(){
		return ( "MyException + details + " );
		
	}
}
