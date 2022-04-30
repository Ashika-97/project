package bankFile;

import java.util.Map;

public interface BankFileLayer {
	
	
	public void writeObjectToFile(Map<Integer,CustomerPojo> map,Map<Integer,Map<Integer,AccountPojo>> account);
	
	public 	BankCacheFile readObjectFile(); 

}
