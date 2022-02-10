package decs;
import java.io.*;
import java.util.StringJoiner;
import java.util.Arrays;
public class StringsTask{
public void  isEmptyCheck(String myStrings) throws Exception{
if(myStrings==null||myStrings.isEmpty())
{
throw new Exception("the given string is empty or null");
}
}
public void stringArray(String[] array) throws Exception
{
for(String stringOutput:array){
isEmptyCheck(stringOutput);
}
}
public int lengthCheck(int length,int stringLength) throws Exception
{
if(length<=0||stringLength<length){
throw new Exception("the numbers cant be zero or less than zero");}
return length;
}

//1
public int getLength(String inputString) throws Exception{
 isEmptyCheck(inputString);
 return inputString.length();}
//2
public char[] getToChar(String stringCharacter) throws Exception{

//nullArrayCheck(stringcharacter);
 isEmptyCheck(stringCharacter);
 char[] charac=stringCharacter.toCharArray();
   /* for (char c:charac)
        {
            System.out.println(c);
         } */
return charac;
}
//3
public char getLastOneBefore(String firstInput,int number) throws Exception{
// nullArrayCheck(firstinput);
 isEmptyCheck(firstInput);
 char character=firstInput.charAt(number);
 return character;
 }
 //4
public int  getOccurence(String repeatCheck,char occur) throws Exception
{
//isEmptyCheck(repeatCheck);
int count=0;
int len=getLength(repeatCheck);
  for(int i=0;i<len;i++)
  {
    if(repeatCheck.charAt(i)==occur){
         count++;
        }}
         System.out.println("the ocurrence of the given letter " + count + " ti+mes");    
return count;
}
//5
public int getGreaterPosition(String greatInput,char highInput) throws Exception 
{ 
isEmptyCheck(greatInput); 
int highPosition=greatInput.lastIndexOf(highInput);
return highPosition;
}
//6
public String getLastncharacter(String endInput,int len) throws Exception{

//isEmptyCheck(endInput);
int l1=getLength(endInput);
lengthCheck(len,l1);
endInput=endInput.substring(len);     
System.out.println("the sentence is" + endInput);
return endInput;
}
//7 method
public String getFirstn(String beginInput,int numCompress) throws Exception
{
// isEmptyCheck(beginInput);
 int l2=getLength(beginInput);
 lengthCheck(numCompress,l2);
  System.out.println(beginInput.substring(0,numCompress));
       return beginInput;
}
//8
public String getChecked(String oneInput,String secondInput,int num) throws Exception
{
isEmptyCheck(oneInput);
isEmptyCheck(secondInput);
String middle=oneInput+ secondInput.substring(num);
return middle;
}
//9
public  boolean getStarted(String startString,String endString) throws Exception
{
isEmptyCheck(startString);
isEmptyCheck(endString);
boolean boo = startString.startsWith(endString);
return boo;
}
//10
public boolean getEnded(String end1String,String end2String) throws Exception
{
isEmptyCheck(end1String);
isEmptyCheck(end2String);
boolean boo=end1String.endsWith(end2String);
return boo;
}
//11
public String getSmall(String lowInput) throws Exception
{
isEmptyCheck(lowInput);
String str= lowInput.toLowerCase();
return str;
}
//12
public String getCapital(String highInput) throws Exception
{
isEmptyCheck(highInput);
String str= highInput.toUpperCase();
return str;}
//13
public String getReverseStr(String rev,String reverseString) throws Exception
{ 
isEmptyCheck(rev);
for(int i=rev.length()-1;i>=0;i--)
       {
  reverseString= reverseString + rev.charAt(i);
  }return reverseString;}
//14 
public String getMultiStrings(String studentInput,String student1Input)  throws Exception
{
isEmptyCheck(studentInput);
isEmptyCheck(student1Input);
String str=studentInput.concat(student1Input);
return str;
}
//15
public String getSpaces(String myInput) throws Exception
{
isEmptyCheck(myInput);
return (myInput.replaceAll(" ",""));
}
 //16 
 public String[] getSplited(String joiningSymbol) throws Exception
 {
 isEmptyCheck(joiningSymbol);
  String[] array=joiningSymbol.split("\\s");
 return array;
}
//17
 public String getMerged(String[] stringInput,String joinStr) throws Exception 
 {
 stringArray(stringInput);
 isEmptyCheck(joinStr);
	String mergedStr=String.join(joinStr,stringInput);
	return mergedStr;
 }
//18
public  boolean getEquality(String stringInput,String compareInput) throws Exception
{
isEmptyCheck(stringInput);
isEmptyCheck(compareInput);
boolean foo=stringInput.equals(compareInput);
return foo;
}
//19
public boolean getStrEqualityIgnore_1(String inputString,String equalInput) throws Exception
{
isEmptyCheck(inputString);
isEmptyCheck(equalInput);
 boolean foo=inputString.equalsIgnoreCase(equalInput);
  return foo;
}
//20
public String  getNoSpaced(String replacedInput) throws Exception
{
isEmptyCheck(replacedInput);
 return replacedInput.trim();
}
}












