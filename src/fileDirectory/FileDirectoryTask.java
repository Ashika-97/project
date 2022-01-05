package fileDirectory;

import java.io.File;

public class FileDirectoryTask {

	public boolean myDirectory(String path) throws Exception
	{
		try {
		File file=new File(path);
		//boolean bool=file.exists();
		file.mkdir();
		return file.exists();
		}
			catch(Exception ex)
			{   
				System.out.println("exception occured");
				throw new Exception(ex);
			}
	}
		
		
	 public void fileDirectPath(String pathName,String fileInput) throws Exception
		{
	 		try {
			File fileName=new File(pathName,fileInput);
			if(fileName.exists()) {
			  fileName.getName();
			}
			else
			{
			 System.out.println("file created succesfully");
			}}
			//return fileName.createNewFile();}
		catch(Exception exception)
		{
		throw new Exception(exception);
		}
		
	}
	 
}
		
		
		
		
		
		/*if(bool)
		{
			System.out.println("file directory created");
		}
		else
		{
			System.out.println("file directory not created");
			
		}*/
	
	
	
