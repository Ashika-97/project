package mapping;
import java.io.*;
import java.util.*;
import fileHandling.CustomException;
public class HashMapTask{

public void checkNullMap(Map hash) throws CustomException
{
if(hash==null)
{
throw new CustomException("object cant be empty");
}
}
public Map getHashMap() 
{
Map hashMapName=new HashMap();
return hashMapName;
}

public int getSize(Map name) throws CustomException
{
checkNullMap(name);
int length= name.size();
return length;
}
public Object valuePut(Map name,Object input,Object inputValue) throws CustomException
{
checkNullMap(name);
return name.put(input,inputValue);
}

public boolean getContains(Map name, Object value) throws CustomException
{
checkNullMap(name);
return name.containsKey(value);
}

public boolean getValueContains(Map name,Object inputName) throws CustomException
{
checkNullMap(name);
return name.containsValue(inputName);
}

public Object getValueReplace(Map name,Object inputValue,Object validInput) throws CustomException
{
checkNullMap(name);
return name.replace(inputValue,validInput);
}

public Object getName(Map name, Object inputValue) throws CustomException
{
checkNullMap(name);
return name.get(inputValue);
}

public Object getNonName(Map name,Object inputValue,Object valueInput) throws CustomException
{
checkNullMap(name);
return name.getOrDefault(inputValue,valueInput);
}
public Object nonExistingKey(Map map,Object value,Object inputValue) throws CustomException
{
checkNullMap(map);
map.putIfAbsent(value,inputValue);
return map;
}

public Object getRemove(Map name, Object inputValue) throws CustomException
{
checkNullMap(name);
name.remove(inputValue);
return name;
}

public Object getOldRemove(Map name,Object inputValue,Object valueChange) throws CustomException
{
checkNullMap(name);
return name.replace(inputValue,valueChange);
}



public Object removeValue(Map name,Object inputValue,Object oldValue) throws CustomException
{
checkNullMap(name);
return name.remove(inputValue,oldValue);
}

public Object getExistReplace(Map name,Object numInput,Object inputValue) throws CustomException
{
checkNullMap(name);
 return name.replace(numInput,inputValue);
}

/*public Object ValueReplace(Map name,Object value,Object oldValue,Object newValue) throws Exception
{
checkNullMap(name);
name.replace(value,oldValue,newValue);
return name;
}*/

public void getTransfer(Map name,Map changeName) throws CustomException
{
checkNullMap(name);
name.putAll(changeName);
}

public Set getEntry(Map name) throws CustomException
{
checkNullMap(name);
Set set= name.entrySet();
return set;
}

public Set getKeyValue(Map map) throws CustomException
{
checkNullMap(map);
Set set1=map.keySet();
return set1;
}

public Collection getValueSet(Map map) throws CustomException
{
checkNullMap(map);
return map.values();
}
public void removeAll(Map map)throws CustomException
{
checkNullMap(map);
map.clear();
}
}




































