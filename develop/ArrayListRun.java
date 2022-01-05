package arraylist;
import java.util.*;
import java.io.*;
import array.ArrayListTask;

public class ArrayListRun{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
ArrayListTask task=new ArrayListTask();
System.out.println("enter an integer");
int number=scan.nextInt();
scan.nextLine();

switch(number)
{
case 1:
{
try
{
List list=task.getArrayStrings();
System.out.println(list);
int numberr=task.getSize(list);
System.out.println(list);
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}

case 2:
{
try
{
List nameInput=task.getArrayStrings();
int number1=scan.nextInt();
scan.nextLine();
String[] stringInput=new String[number1];
for(int i=0;i<stringInput.length;i++)
{
stringInput[i]=scan.nextLine();
}
nameInput=task.getAdd(nameInput,stringInput);
System.out.println(nameInput);
System.out.println(task.getSize(nameInput));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;
}
case 3:
{
try
{
List numInput=task.getArrayStrings();
int numb=scan.nextInt();
Object[] number1=new Object[numb];
//numInput=task.getAdd(numInput,length1);
for(int i=0;i<numb;i++)
{
number1[i]=scan.nextInt();
}
numInput=task.getAdd(numInput,number1);
System.out.println(numInput);
System.out.println(task.getSize(numInput));
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
List nameInput=task.getArrayStrings();
int number2=scan.nextInt();
Object[] num=new Object[number2];
scan.nextLine();
for(int i=0;i<number2;i++)
{
ArrayListTask access=new ArrayListTask();
num[i]=access;
}
System.out.println(task.getAdd(nameInput,num));
System.out.println(nameInput);
System.out.println(task.getSize(nameInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 5:
{
try
{
List nameInput=task.getArrayStrings();
int num=scan.nextInt();
Object[] number1=new Object[num];
scan.nextLine();
for(int i=0;i<number1.length;i++)
{
number1[i]=scan.nextInt();
}
System.out.println(task.getAdd(nameInput,number1));
int number3=scan.nextInt();
scan.nextLine();
Object[] stringName=new Object[number3];
for(int j=0;j<number3;j++)
{
stringName[j]=scan.nextLine();}
System.out.println(task.getAdd(nameInput,stringName));
int number2=scan.nextInt();
scan.nextLine();
Object[] numberlength1=new Object[number2];
scan.nextLine();
for(int k=0;k<number2;k++)
{
ArrayListTask access=new ArrayListTask();
numberlength1[k]=access;}
nameInput=task.getAdd(nameInput,numberlength1);
System.out.println(nameInput);
System.out.println(task.getSize(nameInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 6:
{
try
{
List nameInput=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] name=new Object[num];
for(int i=0;i<num;i++)
{
name[i]=scan.nextLine();
}
System.out.println(task.getAdd(nameInput,name));
//int num1=scan.nextInt();
//String[] num1=new String[num1];
//for(int j=0;j<num1.length;j++)
//{
//num1[j]=scan.nextLine();
String name1=scan.nextLine();
System.out.println(task.getIndexOf(nameInput,name1));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 7:
{
try
{
List nameInput=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] name=new Object[num];
for(int i=0;i<num;i++)
{
name[i]=scan.nextLine();}
System.out.println(task.getAdd(nameInput,name));

for(ListIterator  iter=nameInput.listIterator();iter.hasNext();)
{
System.out.println(iter.next());
}
System.out.println(task.getSize(nameInput));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 8:
{
try
{
List nameInput=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] name=new Object[num];
//System.out.println(task.getAdd(nameInput,name));
for(int i=0;i<name.length;i++)
{
name[i]=scan.nextLine();
}
System.out.println(task.getAdd(nameInput,name));
int num1=scan.nextInt();
System.out.println(task.getStringName(nameInput,num1));
System.out.println(task.getSize(nameInput));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 9:
{
try
{
List nameInput=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] name=new Object[num];
//System.out.println(task.getAdd(nameInput,name));
for(int i=0;i<name.length;i++)
{
name[i]=scan.nextLine();}
System.out.println(task.getAdd(nameInput,name));

//int numberLength=scan.nextInt();
//String[] name2=new String[numberLength];
//for(int j=0;j<name2.length;j++)
//{
//name2[j]=scan.nextLine();}
String num1=scan.nextLine();
System.out.println(task.getIndexOf(nameInput,num1));
//String numberLength1=scan.nextInt();
//String[] name3=new String[numberLength1];
//for(int k=0;k<name2.length;k++)
//{
//name3[k]=scan.nextLine();
String num2=scan.nextLine();
System.out.println(task.getLastIndexOf(nameInput,num2));
System.out.println(task.getSize(nameInput));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 10:
{
try
{
List nameInput=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] name=new Object[num];
//System.out.println(task.getAdd(nameInput,name));
for(int i=0;i<name.length;i++)
{
name[i]=scan.nextLine();}
System.out.println(task.getAdd(nameInput,name));

String myName=scan.nextLine();
/*int num1=scan.nextInt();
String[] myName=scan.nextLine[num1];
{
for(int j=0;j<myName.length;j++)
{
myName[j]=scan.nextLine();}*/
int num1=scan.nextInt();
System.out.println(task.getString(nameInput,num1,myName));
System.out.println(task.getSize(nameInput));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 11:
{
try
{
List listName=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] inputName=new Object[num];
for(int i=0;i<inputName.length;i++)
{
inputName[i]=scan.nextLine();}
System.out.println(task.getAdd(listName,inputName));

System.out.println(task.getSize(listName));
int num1=scan.nextInt();
int num2=scan.nextInt();
listName=task.getSubList(listName,num1,num2);
List listName2=listName;
System.out.println(listName2);
System.out.println(task.getSize(listName2));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}


case 12:
{
try
{
List listName=task.getArrayStrings();
int num1=scan.nextInt();
scan.nextLine();
Object[] string=new Object[num1];
for(int i=0;i<num1;i++)
{
string[i]=scan.nextLine();}
System.out.println(task.getAdd(listName,string));
List listName2=task.getArrayStrings();
int num2=scan.nextInt();
scan.nextLine();
Object[] string1=new Object[num2];
for(int j=0;j<num2;j++)
{
string1[j]=scan.nextLine();
}
System.out.println(task.getAdd(listName2,string1));
listName=task.merger(listName,listName2);
List listAll=listName;
System.out.println(listAll);
System.out.println(task.getSize(listAll));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}



case 13:
{
try
{
List listName=task.getArrayStrings();
int num1=scan.nextInt();
scan.nextLine();
Object[] string=new Object[num1];
for(int i=0;i<num1;i++)
{
string[i]=scan.nextLine();}
System.out.println(task.getAdd(listName,string));
List listName2=task.getArrayStrings();
int num2=scan.nextInt();
scan.nextLine();
Object[] string1=new Object[num2];
for(int j=0;j<num2;j++)
{
string1[j]=scan.nextLine();
}
System.out.println(task.getAdd(listName2,string1));
listName=task.merger(listName2,listName);
List listAll=listName;
System.out.println(listAll);
System.out.println(task.getSize(listAll));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}


case 14:
{
try
{
List listName=task.getArrayStrings();
int num1=scan.nextInt();
scan.nextLine();
Object[] num=new Object[num1];
for(int i=0;i<num1;i++)
{
num[i]=scan.nextDouble();}
System.out.println(task.getAdd(listName,num));

System.out.println(task.getSize(listName));
Double num2=scan.nextDouble();
//Object[] leng1=new Object[num2];
//for(int j=0;j<num2;j++)
//{
//leng1[j]=scan.nextDouble();}
//System.out.println(task.getAdd(listName,leng1));
System.out.println(task.getRemove(listName,num2));
System.out.println(listName);
System.out.println(task.getSize(listName));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 15:
{
try
{
List listName=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] inputName=new Object[num];
for(int i=0;i<inputName.length;i++){
inputName[i]=scan.nextLine();}
System.out.println(task.getAdd(listName,inputName));
System.out.println(task.getSize(listName));
List listName1=task.getArrayStrings();
int num1=scan.nextInt();
scan.nextLine();
Object[] inputName1=new Object[num1];
for(int j=0;j<inputName1.length;j++){
inputName[j]=scan.nextLine();}
System.out.println(task.getAdd(listName1,inputName1));
System.out.println(task.getRemoveAll(listName,listName1));
System.out.println(task.getSize(listName));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 16:
{
try
{
List listName=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] inputName=new Object[num];
for(int i=0;i<inputName.length;i++){
inputName[i]=scan.nextLine();}
//System.out.println(task.getAdd(listName,inputName));}
listName=task.getAdd(listName,inputName);
System.out.println(task.getSize(listName));
List listName1=task.getArrayStrings();

int num1=scan.nextInt();
scan.nextLine();
Object[] inputName1=new Object[num1];
for(int j=0;j<num1;j++){
inputName[j]=scan.nextLine();
}

System.out.println(task.getAdd(listName1,inputName1));
System.out.println(task.getRetain(listName,listName1));
System.out.println(task.getSize(listName));}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 17:
{
try
{
List listName=task.getArrayStrings();
int num=scan.nextInt();
Object[] num1=new Object[num];
for(int i=0;i<num1.length;i++)
{
num1[i]=scan.nextLong();}
System.out.println(task.getAdd(listName,num1));
System.out.println(task.getSize(listName));
System.out.println(task.getRemoveAll(listName,listName));
System.out.println(task.getSize(listName));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}

case 18:
{
try
{
List listName=task.getArrayStrings();
int num=scan.nextInt();
scan.nextLine();
Object[] inputName=new Object[num];
for(int i=0;i<inputName.length;i++)
{
inputName[i]=scan.nextLine();}
listName=task.getAdd(listName,inputName);
System.out.println(listName);
Object newName=scan.nextLine();
/*int num1=scan.nextInt();
scan.nextLine();
Object[] newName=new Object[num1];
for(int j=0;j<newName.length;j++)
{
newName[j]=scan.nextLine();}*/
System.out.println(task.getContains(listName,newName));
System.out.println(task.getSize(listName));
}
catch(Exception exception)
{
System.out.println("exception thrown");
}
break;}
}}}














































