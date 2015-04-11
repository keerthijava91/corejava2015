package io;
import java.io.File;
import java.io.IOException;

public class Fileio {
	public static void main(String[]args)
	{
		try{
			boolean newfile =false ;
		    File file =new File("h2kinfosys.txt");
		    //creating the directory
		    File dir =new File("h2kinfosys.dir");
		    System.out.println(dir.isDirectory());
		    System.out.println(dir.mkdir());
			//System.out.println(file.exists());
			//creating the file
			newfile=file.createNewFile();
			//System.out.println(newfile);
		    //System.out.println(file.exists());
			//System.out.println(file.getAbsolutePath());
			
		}
		catch(IOException e){
		  e.printStackTrace();
		}
	}

}
