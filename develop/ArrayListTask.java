package array;
import java.io.*;
import java.util.*;
public class ArrayListTask{

public void listCheck(List  list) throws Exception
{
if(list==null)
{
System.out.println("list cant be null");
}
}
  
public void lengthCheck(int number,int arrayListLength) throws Exception
{
if(arrayListLength<number)
{
System.out.println("enter a number contains in arraylist");
}
}
  
  
public List getArrayStrings() throws Exception{
List input=new ArrayList();
return input;
}

public List getAdd(List list,Object[] myInput) throws Exception
{
listCheck(list);
Collections.addAll(list,myInput);
return list;
}

public int getSize(List list) throws Exception{
listCheck(list);
int length=list.size();
return length;
}

public Object getStringName(List list,int input) throws Exception{
listCheck(list);
int leng2=getSize(list);
lengthCheck(input,leng2);
return list.get(input);
}

public int getIndexOf(List list,Object myInput) throws Exception
{
listCheck(list);
int num=list.indexOf(myInput);
return num;
}


public int getLastIndexOf(List list,Object strings) throws Exception
{
listCheck(list);
int num= list.lastIndexOf(strings);
return num;
}
//add specified element to position
public List getString(List list,int numb,Object stringInput) throws Exception
{
listCheck(list);
int  numb1=getSize(list);
lengthCheck(numb,numb1);
list.add(numb,stringInput);
return list;
}
public List getSubList(List list,int fromIndex,int lastIndex) throws Exception
{
int len1=getSize(list);
lengthCheck(fromIndex,len1);
lengthCheck(lastIndex,len1);
listCheck(list);
return list.subList(fromIndex,lastIndex);

}

public boolean getRemove(List list,Object myStrings) throws Exception
{
listCheck(list);
return list.remove(myStrings);
}
//
public List getRemoveAll(List list,Collection stringInput) throws Exception
{
listCheck(list);
list.removeAll(stringInput);
return list;}

public boolean getRetain(List list,Collection inputStrings) throws Exception
{
listCheck(list);
return list.retainAll(inputStrings);

}

public boolean getContains(List list,Object stringInput) throws Exception
{
listCheck(list);
return list.contains(stringInput);
}

public List merger(List list,List myInput) throws Exception
{
listCheck(list);
listCheck(myInput);
Collections.addAll(list,myInput);
return list;
}
}


