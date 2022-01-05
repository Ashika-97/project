package fileProject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileCreateTask {


	public boolean fileCreationMethod(String name) throws Exception
	{
		File fileName=new File(name);
		if(fileName.exists()) {
		  fileName.getName();
		}
		else
		{
		 System.out.println("file created succesfully");
		}
		return fileName.createNewFile();
	}
	
	public void  fileWriterMethod(String stringInput,String nameInput) throws Exception {
		BufferedWriter writer=null;
		try{
			
	    FileWriter inputName=new FileWriter(stringInput,true);
	    writer=new BufferedWriter(inputName);
	    writer.write(nameInput);
	    writer.newLine();
	    writer.close();
	    }
		catch(IOException exception)
		{
			exception.printStackTrace();
		}
        finally {
              writer.close();	
        }
        }
	}
