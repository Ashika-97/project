package bind;
import builder.StringBuilderTask;
import java.util.*;
import java.io.*;
public class StringBuilderRun{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
StringBuilderTask object=new StringBuilderTask();
System.out.println("enter an integer with limit 1 to 10");
int number=scan.nextInt();
scan.nextLine();
switch(number)
{
  case 1:
   {
   try
      { 
System.out.println("don't enter a string:");
StringBuilder strBuild=object.stringBuilder();
System.out.println(strBuild);
System.out.println(object.getLength(strBuild));
System.out.println("enter the string:");
String myString=scan.nextLine();
strBuild=object.append(strBuild,myString);
//System.out.println("The string is " + strbuild.toString());
System.out.println(object.getLength(strBuild));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 2:
{
try{
System.out.println("enter a string");
StringBuilder inputString=object.stringBuilder();
String myString=scan.nextLine();
inputString=object.append(inputString,myString);
System.out.println(object.getLength(inputString));
int num=scan.nextInt();
scan.nextLine();
for(int i=0;i<num;i++)
{
System.out.println("enter a string");
String check=scan.nextLine();
inputString=object.append(inputString,check);
System.out.println("enter a symbol");
String chHash=scan.nextLine();
inputString=object.append(inputString,chHash);
System.out.println(inputString.toString().trim());}
System.out.println(inputString.toString());
System.out.println(object.getLength(inputString));}
catch(Exception exception)
{
System.out.println("exception thrown");}
break;
}
case 3:
{
try
{
StringBuilder inputString=object.stringBuilder();
String mystring=scan.nextLine();
inputString=object.append(inputString,mystring);
System.out.println(object.getLength(inputString));
int num1=scan.nextInt();
//scan.nextLine();
for(int i=0;i<num1;i++)
{
int num=scan.nextInt();
scan.nextLine();
String myInput=scan.nextLine();
//inputString=object.append(inputString,myInput);
inputString=object.insert(inputString,num,myInput);
System.out.println(inputString.toString());}
System.out.println(object.getLength(inputString));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 4:
{
try
{
StringBuilder deleteInput=object.stringBuilder();
String inputString=scan.nextLine();
deleteInput=object.append(deleteInput,inputString);
System.out.println(object.getLength(deleteInput));
int length=scan.nextInt();
scan.nextLine();
for(int i=0;i<length;i++){
String stringName=scan.nextLine();
deleteInput=object.append(deleteInput,stringName);
String myName=scan.nextLine();
deleteInput=object.append(deleteInput,myName);
System.out.println(deleteInput.toString());
System.out.println(object.getLength(deleteInput));}
int num=scan.nextInt();
int num1=scan.nextInt();
deleteInput=object.delete(deleteInput,num,num1);
System.out.println(deleteInput.toString());
System.out.println(object.getLength(deleteInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}break;
}
case 5:
{try
{
StringBuilder replaceInput=object.stringBuilder();
String myName=scan.nextLine();
replaceInput=object.append(replaceInput,myName);
System.out.println(object.getLength(replaceInput));
int len=scan.nextInt();
scan.nextLine();
for(int k=0;k<len;k++)
{
String stringName=scan.nextLine();
replaceInput=object.append(replaceInput,stringName);
String myInput=scan.nextLine();
System.out.println(object.append(replaceInput,myInput));
System.out.println(replaceInput.toString());
System.out.println(object.getLength(replaceInput));
String myStringReplace=scan.nextLine();
int length=scan.nextInt();
int length1=scan.nextInt();
replaceInput=object.replace(replaceInput,length,length1,myStringReplace);}
System.out.println(object.getLength(replaceInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");}
break;}
case 6:
{
try
{
StringBuilder stringInput=object.stringBuilder();
String reverseInput=scan.nextLine();
stringInput=object.append(stringInput,reverseInput);
int num1=scan.nextInt();
scan.nextLine();
for(int i=0;i<num1;i++)
{
String myStringName=scan.nextLine();
stringInput=object.append(stringInput,myStringName);
System.out.println(object.revMethod(stringInput));}
System.out.println(object.getLength(stringInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}break;}
case 7:
{
try
{
StringBuilder stringInput=object.stringBuilder();
String myString=scan.nextLine();
stringInput=object.append(stringInput,myString);
System.out.println(object.getLength(stringInput));
int num=scan.nextInt();
int num1=scan.nextInt();
scan.nextLine();
stringInput=object.delete(stringInput,num,num1);
System.out.println(stringInput.toString());
System.out.println(object.getLength(stringInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}
case 8:
{
try
{
StringBuilder stringInput=object.stringBuilder();
String myInput=scan.nextLine();
stringInput=object.append(stringInput,myInput);
System.out.println(object.getLength(stringInput));
int len1=scan.nextInt();
int len2=scan.nextInt();
scan.nextLine();
String replaceString=scan.nextLine();
stringInput=object.replace(stringInput,len1,len2,replaceString);
System.out.println(object.getLength(stringInput));
System.out.println(stringInput.toString());
}
catch(Exception exception)
{
System.out.println("exception thrown");}break;}
case 9:
{try
{
StringBuilder builtString=object.stringBuilder();
String inputString=scan.nextLine();
builtString=object.append(builtString,inputString);
int length=scan.nextInt();
scan.nextLine();
for(int k=0;k<length;k++)
{
String inputSymbol=scan.nextLine();
builtString=object.append(builtString,inputSymbol);
String inputLine=scan.nextLine();
System.out.println(object.append(builtString,inputLine));}
System.out.println(builtString.toString());
System.out.println(object.getLength(builtString));
String mineString=scan.nextLine();
int len1=scan.nextInt();
scan.nextLine();
System.out.println(object.firstIndexString(builtString,mineString,len1));}

catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 10:
{
try{
StringBuilder stringBuilt=object.stringBuilder();
String myString=scan.nextLine();
stringBuilt=object.append(stringBuilt,myString);
int num1=scan.nextInt();
scan.nextLine();
for(int j=0;j<num1;j++)
{
String inputString=scan.nextLine();
stringBuilt=object.append(stringBuilt,inputString);
String symbolLine=scan.nextLine();
stringBuilt=object.append(stringBuilt,symbolLine);
}
System.out.println(object.getLength(stringBuilt));
String lastString=scan.nextLine();
int length3=scan.nextInt();
System.out.println(object.lastIndex(stringBuilt,lastString,length3));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
}
}}



/*case 2:
{
try
{
System.out.println("enter the string:");
StringBuilder inputString=new StringBuilder(scan.nextLine());
System.out.println(inputString.length());
System.out.println("enter the number to get strings:");
int num=scan.nextInt();
scan.nextLine();
for(int i=0;i<num;i++)
{
System.out.println("enter a  string");
inputString.append(scan.nextLine());
System.out.println("enter an symbol");
inputString.append(scan.nextLine());
}
System.out.println(object.getInputLength(inputString));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 3:
{
try
{System.out.println("enter two strings with spaces");
StringBuilder spaceInput=new StringBuilder(scan.nextLine());
System.out.println(spaceInput.length());
System.out.println("enter the number to get strings:");
int two=scan.nextInt();
scan.nextLine();
for(int no=0;no<two;no++)
{
System.out.println("enter the number to insert");
int no1=scan.nextInt();
scan.nextLine();
System.out.println("enter a character");
StringBuilder scanner=new StringBuilder(scan.nextLine()); 
System.out.println(spaceInput.insert(no1,scanner));
}
System.out.println(object.getSpaceLength(spaceInput));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
 case 4:
{
try
{
System.out.println("enter two strings with spaces");
StringBuilder deleteInput=new StringBuilder(scan.nextLine());
System.out.println(deleteInput.length());
System.out.println("enter the number to get strings:");
int num2=scan.nextInt();
for(int i=0;i<num2;i++)
{
System.out.println("enter the number start st delete:");
int num1=scan.nextInt();
System.out.println("enter the number end at delete:");
int num3=scan.nextInt();
System.out.println(deleteInput.delete(num1,num3));
}
System.out.println(object.getDeleteLength(deleteInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}

case 5:
{try
{
System.out.println("enter two strings with spaces");
StringBuilder threeInput=new StringBuilder(scan.nextLine());
System.out.println("enter an number");
String right=scan.nextLine();
int num11=Integer.parseInt(right);
for(int k=0; k<num11;k++)
{
System.out.println("enter a string");
System.out.println(threeInput.append(scan.nextLine()));
System.out.println("enter a symbol");
String thirdString=scan.nextLine();
System.out.println("enter the number start to replace:");
int none=scan.nextInt();
scan.nextLine();
System.out.println("enter the number end to replace:");
int none1=scan.nextInt();
System.out.println(threeInput.replace(none,none1,thirdString));}
System.out.println(object.getThreeLength(threeInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 6:
{
try
{
StringBuilder threeString=new StringBuilder(scan.nextLine());
System.out.println("enter the numberto get the strings you want");
int number1=scan.nextInt();
scan.nextLine();
for(int i=0;i<number1;i++)
{
System.out.println(threeString.append(scan.nextLine()));
}
System.out.println(threeString.length());
System.out.println(threeString.reverse());
System.out.println(object.getThreeStringLength(threeString));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 7:
{
try
{System.out.println("enter a string with atleast 10 letters");
StringBuilder deleteInput=new StringBuilder(scan.nextLine());
System.out.println(deleteInput.length());
System.out.println("enter a first number to start at delete");
int numm=scan.nextInt();
System.out.println("enter a number to end at delete");
int numm1=scan.nextInt();
scan.nextLine();
System.out.println(deleteInput.delete(numm,numm1));
System.out.println(object.getDeleteStringLength(deleteInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 8:
{
try
{
System.out.println("enter a string with atleast 10 letters");
StringBuilder replaceInput=new StringBuilder(scan.nextLine());
replaceInput.length();
System.out.println("enter a number to print no. of times");
int alpha=scan.nextInt();
for(int alp=0;alp<alpha;alp++)
{
System.out.println("enter a first number to replace at start");
int num_1=scan.nextInt();
System.out.println("enter a first number to replace at end");
int num_2=scan.nextInt();
scan.nextLine();
System.out.println("enter a string");
String myWord=scan.nextLine();
System.out.println(replaceInput.replace(num_1,num_2,myWord));}
System.out.println(object.getReplaceLength(replaceInput));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 9:
{
try
{
StringBuilder firstIndex=new StringBuilder(scan.nextLine());
System.out.println("enter the number");
String nom=scan.nextLine();
int no_1=Integer.parseInt(nom);
//scan.nextLine();
for(int k=0;k<no_1;k++)
{
System.out.println("enter a string");
System.out.println(firstIndex.append(scan.nextLine()));
}
System.out.println(firstIndex.length());
System.out.println("enter a symbol to locate last");
String mineString=scan.nextLine();
System.out.println("enter a num to firstindex");
int l1=scan.nextInt();
System.out.println(firstIndex.indexOf(mineString,l1));
System.out.println(object.getFirstLength(firstIndex));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}

case 10:
{
try
{
StringBuilder lastIndex=new StringBuilder(scan.nextLine());
System.out.println("enter the number");
String inpLoop=scan.nextLine();
int no_2=Integer.parseInt(inpLoop);
for(int k=0;k<no_2;k++)
{
System.out.println("enter a string");
System.out.println(lastIndex.append(scan.nextLine()));
}
System.out.println(lastIndex.length());

System.out.println("enter a symbol to locate last");
String checkString=scan.nextLine();
System.out.println("enter a num to lastindex");
int level=scan.nextInt();
int indexno=lastIndex.lastIndexOf(checkString,level);
System.out.println(lastIndex.length());
System.out.println(object.getLastLength(lastIndex));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}
}
}}*/
