package bankFile;

import java.io.*;
import java.util.Map;

public class fileSerialize implements BankFileLayer {

	
	private static final long serialVersionUID = 1L;
	
	int accountNo;
	int customerNo;
	
	
	public int getAccountNumber()
	{
		return this.accountNo;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNo=accountNumber;
	}
	
	public int getCustomerNo()
	{
		return this.customerNo;
	}
	
	public void setCustomerNumber(int customerNumber)
	{
		this.customerNo=customerNumber;
	}

	
	
	public void writeObjectToFile(Map<Integer,CustomerPojo> map,Map<Integer,Map<Integer,AccountPojo>> account)
	{
		BankCacheFile cache=new BankCacheFile();
		LogicBank log=new LogicBank();
		
		try {
	     	File file=new File("BankDetails.txt");
	     	if(file.exists())
	     	{
	     		System.out.println("file created successfully");
	     	}
	     	else {
	     		file.createNewFile();
	     	}
		    FileOutputStream  out=new FileOutputStream(file,true); 
		    ObjectOutputStream object=new ObjectOutputStream(out);
		    object.writeObject(map);
		    object.writeObject(account);
		    out.close();
		    object.close();
		     
		    System.out.println("the file serialization is written successfully");
		     }
		catch(IOException  e)
		 {
			e.printStackTrace();
			System.out.println("Exception in Filewrite serialization");
		 }
	}
		
	public 	BankCacheFile readObjectFile() 
	{
	   
		BankCacheFile cache=new BankCacheFile();
		
		try {
			FileInputStream fileIn=new FileInputStream("BankDetails.txt");
			ObjectInputStream objectIn= new ObjectInputStream(fileIn);
			
			Map<Integer,CustomerPojo> object1= (Map<Integer, CustomerPojo>) objectIn.readObject();
			
			Map<Integer,Map<Integer,AccountPojo>> object2=(Map<Integer,Map<Integer,AccountPojo>>) objectIn.readObject();
			cache.getMap(object1, object2);
			fileIn.close();
			objectIn.close();
			cache.getMap(object1, object2);
		    }
		catch(IOException|ClassNotFoundException e)
		    {
			 e.printStackTrace();
			 System.out.println("the Exception in read ObjectFile");
		}
		
		return cache;
	}


}
