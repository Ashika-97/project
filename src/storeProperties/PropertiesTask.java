package storeProperties;
import java.io.*;
import java.util.*;

public class PropertiesTask {

	public Properties propertiesMethod() 
	{
		Properties prop=new Properties();
		return prop;
	}
	
   public void setValues(Properties inputprop,String keys,String values) throws Exception
   {
		
		inputprop.setProperty(keys,values);

		}
	
	
public void  propertyWriteMethod(Properties inputprop,String inputName )throws Exception {
	
	BufferedWriter buffer=null;
	try {
		
	    FileWriter writer=new FileWriter(inputName,true);
	    buffer=new BufferedWriter(writer);
	    inputprop.store(writer,null);
	}
catch(Exception ex)
	{
	throw new  Exception(ex);
	}
	finally {
	buffer.close();
	}
	}
  }

