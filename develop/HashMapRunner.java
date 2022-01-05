package hash;
import java.util.*;
import java.io.*;
import mapping.HashMapTask;

public class HashMapRunner 
{
static Scanner scan=new Scanner(System.in);
HashMapTask task=new HashMapTask();

public Map commonCreationMap()
{
 Map hashString=task.getHashMap();
 return hashString;}


public void commonString(Map hashString)
{
try{
System.out.println("enter thenumber to loop");
int num=scan.nextInt();
scan.nextLine();
for(int i=0;i<num;i++)
{
System.out.println("enter the keys");
String nameInput=scan.nextLine();
System.out.println("enter the values");
String inputValues=scan.nextLine();
task.valuePut(hashString,nameInput,inputValues);
}
System.out.println(hashString);
System.out.println(task.getSize(hashString));
}
catch(InputMismatchException e)
{
System.out.println("you have entered string in place of number");
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

}
//1
private  void  case1Method(){
try
{
Map hashInput=task.getHashMap();
System.out.println(hashInput);
System.out.println(task.getSize(hashInput));
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

}

public void case2Method()
{

try
{
Map hash=commonCreationMap();
System.out.println("enter thenumber to loop");
int number3=scan.nextInt();
scan.nextLine();
for(int i=0;i<number3;i++)
{
System.out.println("enter the keys");
String nameInput=scan.nextLine();
System.out.println("enter the values");
String inputValues=scan.nextLine();
task.valuePut(hash,nameInput,inputValues);
}
System.out.println(hash);
System.out.println(task.getSize(hash));

}
catch(InputMismatchException e)
{
System.out.println("you have entered string in place of number");
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

} //end

public void case3Method()
{
try
{
Map hash=commonCreationMap();
System.out.println("enter thenumber to loop");
int num=scan.nextInt();
scan.nextLine();
for(int i=0;i<num;i++)
{
System.out.println("enter the keys");
int nameInput=scan.nextInt();
System.out.println("enter the values");
int inputValues=scan.nextInt();
task.valuePut(hash,nameInput,inputValues);}
System.out.println(hash);
System.out.println(task.getSize(hash));}
catch(InputMismatchException e)
{
System.out.println("you have entered string in place of number");
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

}

public void case4Method()
{
try
{
Map hash=commonCreationMap();
System.out.println("enter thenumber to loop");
int num=scan.nextInt();
scan.nextLine();
for(int i=0;i<num;i++)
{
System.out.println("enter the keys");
String nameInput=scan.nextLine();
System.out.println("enter the values");
int inputValues=scan.nextInt();
scan.nextLine();
task.valuePut(hash,nameInput,inputValues);}
System.out.println(hash);
System.out.println(task.getSize(hash));}

catch(InputMismatchException e)
{
System.out.println("you have entered string in place of number");
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

}

public void case5Method()
{
try
{
Map hash=commonCreationMap();
System.out.println("enter thenumber to loop");
int num=scan.nextInt();
scan.nextLine();
for(int i=0;i<num;i++)
{
System.out.println("enter the keys");
String nameInput=scan.nextLine();
System.out.println("enter the values");
double inputValues=scan.nextDouble();
scan.nextLine();
task.valuePut(hash,nameInput,inputValues);}
System.out.println(hash);
System.out.println(task.getSize(hash));}

catch(InputMismatchException e)
{
System.out.println("you have entered string in place of number");
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

}

public void case6Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println(task.getSize(hash));
}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case8Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println("enter the checking string key contains");
String nameContain=scan.nextLine();
System.out.println(task.getContains(hash,nameContain));
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}}

public void case9Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println("enter the checking string value contains");
String nameContain=scan.nextLine();
System.out.println(task.getValueContains(hash,nameContain));
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}}

public void case10Method(){
try
{

Map hash=commonCreationMap();
commonString(hash);
int num1=scan.nextInt();
scan.nextLine();
for(int j=0;j<num1;j++)
{
System.out.println("enter the already keys");
String changeInput=scan.nextLine();
System.out.println("enter the change values");
String changeInput1=scan.nextLine();
System.out.println(task.getExistReplace(hash,changeInput,changeInput1));}
System.out.println(hash);
System.out.println(task.getSize(hash));
}

catch(InputMismatchException e)
{
System.out.println("you have entered string in place of number");
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

}

public void case11Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println("enter the existing string value contains");
String nameContain=scan.nextLine();
System.out.println(task.getName(hash,nameContain));
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case12Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println("enter the existing string value contains");
String nameContain=scan.nextLine();
System.out.println("enter the default value contains");
String defaultValue=scan.nextLine();
System.out.println(task.getNonName(hash,nameContain,defaultValue));
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case13Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println("enter the string key");
String nameContain=scan.nextLine();
System.out.println("enter the string value");
String defaultValue=scan.nextLine();
System.out.println(task.nonExistingKey(hash,nameContain,defaultValue));
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case14Method(){

try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println(task.getSize(hash));
System.out.println("enter a key already specified");
String nameChange=scan.nextLine();
System.out.println(task.getRemove(hash,nameChange));
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case15Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println("enter the string key"); 
String nameKey=scan.nextLine();
System.out.println("enter the string Value already specified"); 
String nameValue=scan.nextLine();
task.removeValue(hash,nameKey,nameValue);
System.out.println(hash);
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case16Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
String oldChange=scan.nextLine();
String newChange=scan.nextLine();
System.out.println(task.getExistReplace(hash,oldChange,newChange));
System.out.println(hash);
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case17Method(){

try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println("enter the old value");
String nameChange=scan.nextLine();
System.out.println("enter the new value");
String newName=scan.nextLine();
System.out.println(task.getOldRemove(hash,nameChange,newName));
System.out.println(hash);
System.out.println(task.getSize(hash));}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}

public void case18Method(){
try
{
Map hash=commonCreationMap();
commonString(hash);
Map hash1=commonCreationMap();
System.out.println("enter thenumber to loop");
int num1=scan.nextInt();
scan.nextLine();
for(int i=0;i<num1;i++)
{
System.out.println("enter the keys");
String nameInput1=scan.nextLine();
System.out.println("enter the values");
String inputValues1=scan.nextLine();
task.valuePut(hash1,nameInput1,inputValues1);}
System.out.println(hash1);
System.out.println(task.getSize(hash1));
task.getTransfer(hash1,hash);
System.out.println(hash1);
System.out.println(task.getSize(hash1));}


catch(InputMismatchException e)
{
System.out.println("you have entered string in place of number");
}
catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}

}

public void case19Method(){
try
{

Map hash=commonCreationMap();
commonString(hash);
task.getEntry(hash);
for(Object iterate: task.getEntry(hash))
{
System.out.println(iterate);
}
System.out.println(task.getKeyValue(hash));
System.out.println(task.getValueSet(hash));
}


catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}


public void case20Method(){

try
{
Map hash=commonCreationMap();
commonString(hash);
System.out.println(task.getEntry(hash));
System.out.println(task.getKeyValue(hash));
System.out.println(task.getValueSet(hash));
}

catch(CustomException ex)
{
System.out.println("error");
ex.printStackTrace();
}
}


public static void main(String[] args)
{

System.out.println("enter an integer");
int number=scan.nextInt();
scan.nextLine();
HashMapRunner obj=new HashMapRunner();



switch(number)
{

case 1: obj.case1Method();
break;

case 2:obj.case2Method();
break;

case 3:obj.case3Method();
break;

case 4:obj.case4Method();
break;

case 5:obj.case5Method();
break;

case 6:obj.case6Method();
break;

case 7:obj.case6Method();
break;

case 8:obj.case8Method();
break;

case 9:obj.case9Method();
break;

case 10:obj.case10Method();
break;

case 11:obj.case11Method();
break;

case 12:obj.case12Method();
break;

case 13:obj.case13Method();
break;

case 14:obj.case14Method();
break;

case 15:obj.case15Method();
break;

case 16:obj.case16Method();
break;

case 17:obj.case17Method();
break;

case 18:obj.case18Method();
break;

case 19:obj.case19Method();
break;

case 20:obj.case20Method();
break;
}
}}
