package builder;
import decs.StringsTask;
import java.util.*;
import java.io.*;
public class StringBuilderTask{
StringsTask obj=new StringsTask();

public void isNull(StringBuilder myString) throws Exception{
if(myString==null)
{
throw new Exception("the StringBuilder can't not empty");
}
}

public void lengthCheck(StringBuilder stringInput) throws Exception
{
int len=getLength(stringInput);
if(len<0)
{
throw new Exception("StringBuilder length cant be null");}
}

public StringBuilder stringBuilder() throws Exception
{
StringBuilder myInput = new StringBuilder();
return myInput;
}
public StringBuilder append(StringBuilder myInput,String myString) throws Exception
{
isNull(myInput);
obj.isEmptyCheck(myString);
myInput.append(myString);
return myInput;}

public int getLength(StringBuilder myBuilder) throws Exception
{
int len= myBuilder.length();
return len;
}

public StringBuilder insert(StringBuilder myInput,int num,String myString) throws Exception
{
isNull(myInput);
obj.isEmptyCheck(myString);
myInput.insert(num,myString);
return myInput;
}
public StringBuilder delete(StringBuilder myString,int number,int number1) throws Exception
{
isNull(myString);
myString.delete(number,number1);
return myString;
}
public StringBuilder replace(StringBuilder myInput,int num,int num1,String myString) throws Exception
{
isNull(myInput);
obj.isEmptyCheck(myString);
myInput.replace(num,num1,myString);
return myInput;
}
public StringBuilder revMethod(StringBuilder myString) throws Exception
{
isNull(myString);
myString.reverse();
return myString;}

public int firstIndexString(StringBuilder myBuilder,String myIndex,int leng1) throws Exception
{
isNull(myBuilder);
obj.isEmptyCheck(myIndex);
int length=myBuilder.indexOf(myIndex,leng1);
return length;
}
public int lastIndex(StringBuilder myBuilt,String stringLast,int num) throws Exception
{
isNull(myBuilt);
obj.isEmptyCheck(stringLast);
int number=myBuilt.lastIndexOf(stringLast,num);
return number;
}
}

/*//1
public int getNoString(StringBuilder noString) throws Exception
{
isNull(noString);
 int lengthString=getInputLength(noString);
  return lengthString;}
//2
public int getInputLength(StringBuilder inputString)  throws Exception
{
isNull(inputString);
 int num=inputString.length();
  return num;}
//3
public int getSpaceLength(StringBuilder spaceInput) throws Exception
{
isNull(spaceInput);
 //System.out.println(spaceInput.toString());
int lengthString=getInputLength(spaceInput);
  return lengthString;}
//4
public int getDeleteLength(StringBuilder deleteInput) throws Exception
{
isNull(deleteInput);
int lengthString=getInputLength(deleteInput);
return lengthString;}
//5
public int getThreeLength(StringBuilder threeInput) throws Exception
{
isNull(threeInput);
int lengthString=getInputLength(threeInput);
return lengthString;}
//6
public int getThreeStringLength(StringBuilder threeString) throws Exception
{
isNull(threeString);
int lengthString=getInputLength(threeString);
  return lengthString;}
//7
public int getDeleteStringLength(StringBuilder deleteInput) throws Exception
{
isNull(deleteInput);
int lengthString=getInputLength(deleteInput);
  return lengthString;}
//8
public int getReplaceLength(StringBuilder replaceInput) throws Exception
{
isNull(replaceInput);
int lengthString=getInputLength(replaceInput);
  return lengthString;}
//9
public int getFirstLength(StringBuilder firstIndex) throws Exception
{
isNull(firstIndex);
int lengthString=getInputLength(firstIndex);
return lengthString;}
//10
public int getLastLength(StringBuilder lastIndex) throws Exception
{
isNull(lastIndex);
int lengthString=getInputLength(lastIndex);
return lengthString;}
}
*/
