package io;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileoperation {

	public static void main(String[] args) {
		char in[] = new char[50];
		int size =0;
		FileWriter fw = null;
		FileReader fr = null;
		try{
			File file =new File("/Users/keerthivuppula/Documents/corejava/corejava/h2kinfosys.txt");
	      //  fw =  new FileWriter(file);
	        //fw.write("good morning  dady ");
	        fr = new FileReader(file);
	        size = fr.read(in);
	        System.out.println(size + " ");
	        for(char j : in){
	        	System.out.println(j);
	        	}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
//		if(fw != null) ;
//		{
//				try {
//					fw.close();
//			} catch (IOException e) {
//					e.printStackTrace();
//				}
//				
			//}
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
					
				}
			}
			
		}

}
}
