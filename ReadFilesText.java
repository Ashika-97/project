package readProperty;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFilesText {

	public void readerText(Properties propertyInput,String name) throws Exception
	{		    @SuppressWarnings("unused")
	BufferedReader reader=null;
	try
		{   

			FileReader text=new FileReader(name);
			reader=new BufferedReader(text);
			propertyInput.load(text);
			
	}
	catch(IOException ex)
	{
		System.out.println("error file not present");
	throw new IOException(ex);
	}
	}
}
		/*public void storeText(Properties properInput,String inputName) throws Exception
		{
			try
			{
			BufferedWriter buffer =null;
			FileWriter writer=new FileWriter(inputName,true);
			buffer=new BufferedWriter(writer);
			properInput.store(writer,null);
		}
		catch(IOException ex)
		{
		throw new IOException(ex);
		}
	}*/
	

