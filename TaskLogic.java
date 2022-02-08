package newDbPack;
import java.util.Map;
import newDbupdated.DbLayerClass;
import newDbupdated.SelectionPojo;
public class TaskLogic {

	
	DbLayerClass dot=new DbLayerClass();
	
	public void createUpdated() {
		dot.creationOfTable();
	}
	
	public int insertionUpdated(String name,String name1,long numbe1)
	{   int num=0;
		try {
			num=dot.insertionOfTable(name,name1,numbe1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return num;
	}
	public  Map<Integer,SelectionPojo>  selectionUpdate()
	{  
		Map<Integer,SelectionPojo>  mapp=null;
		try 
		{
			mapp=dot.selectionOfTable();
			
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return mapp;
	}
	
	public int updateUpdation(String name,int numb)
	{ 
		int num=0;
		try {
			num=dot.updateOfTable(name,numb);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return num;
	}
	public int deleteUpdate(long numb)
	{ int num=0;
		try {
			num=dot.deleteTable(numb);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return num;
	}
	
	public void dropUpdated()
	{
		try {
			dot.dropOfTable();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void call()
	{
		dot.closeCall();
	}
	
}
