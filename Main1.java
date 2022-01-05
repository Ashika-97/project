package full;
import decs.StringsTask;
import java.io.*;
import java.util.*;
public class Main1{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
StringsTask obj=new StringsTask();
System.out.println("enter an integer with limit 1 to 20");
int n=scanner.nextInt();
scanner.nextLine();
//System.out.println(n);

 switch(n){
 case 1:
  {
  try 
  {
  System.out.println("enter the string");
  String inputString=scanner.nextLine();
  //int len=string.length();
  
  System.out.println("the string length is:" + inputString.length());
  System.out.println("the length is" + obj.getLength(inputString));
  System.out.println("case 1 try block executed");}
  
   catch(Exception e)
   {
   System.out.println("exception thrown");
  }
break;}
     
 
case 2:
{ try{
    System.out.println("Enter the String:");
    String stringCharacter=scanner.nextLine();
    /*for (char c:charac)
        {
            System.out.println(c);
         } */
char[] characterArray=obj.getToChar(stringCharacter);
System.out.println( characterArray);

System.out.println("case 2 try block executed");}
 catch(Exception exception)
{ 
System.out.println("exception thrown 2");
 }
 break;
 }

 case 3:
   {
try
{  System.out.println("enter the string to penultimate");
   String firstInput=scanner.nextLine(); 
   System.out.println("enter a string to penultimate" + firstInput);
   System.out.println("enter the integer:");
   int number=scanner.nextInt();
   System.out.println("the length is " +number);
   //char character=firstInput.charAt(number);
   System.out.println("the length with"+ character);
   System.out.println("the penultimate is "+ obj.getLastOneBefore(firstInput,number));
   System.out.println("try block exceuted");}
   catch(Exception exception)
   { 
	System.out.println("exception thrown 3");
 	}   
break;
   }
 case 4:
    { 
try{
System.out.println("enter the string ");
String repeatCheck=scanner.nextLine();
System.out.println("enter a letter to check");
 char occur=scanner.next().charAt(0);
  int number= obj.getOccurence(repeatCheck,occur);
     System.out.println("try block exceuted at method4");} 
catch(Exception exception)
{ System.out.println("exception thrown 4"); }     
 break;
}
  case 5:
 { try
   {System.out.println("enter the string");  
   String greatInput=scanner.nextLine();
      System.out.println("enter a letter to find the greater position");
      char highInput=scanner.next().charAt(0);
       System.out.println("the greater position is "+ obj.getGreaterPosition(greatInput,highInput));
System.out.println("case 5 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 5");
 }            
break;}
           
  case 6:
      {
try {
System.out.println("enter a sentence that contains atleast 6 letters");
String endInput=scanner.nextLine();   
System.out.println("enter an integer");      
int len=scanner.nextInt();
System.out.println("the getlastn is" + obj.getLastncharacter(endInput,len)); 
System.out.println("case 6 try block executed");}
catch(Exception exception)
{ 

System.out.println("exception thrown 6");
 }         
 break;}
         
  case 7:
       {
try{
System.out.println("enter a number to compress");
int numCompress=scanner.nextInt();
scanner.nextLine();
System.out.println("the sentence are: ");
String beginInput=scanner.nextLine();
 System.out.println(obj.getFirstN(beginInput,numCompress));
 System.out.println("case 7 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 7");
 }   
 break;} 
   case 8:
        {
try{
 System.out.println("enter the first string");
 String oneInput=scanner.nextLine();
 System.out.println("enter the second string");
 String secondInput=scanner.nextLine();
 System.out.println("enter a number");
 int num=scanner.nextInt();
 System.out.println("the checked" + obj.getChecked(oneInput,secondInput,num));
System.out.println("case 8 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 8");
 }       
 break;}
 case 9:
       { 
try {
System.out.println("enter string");
        String startString=scanner.nextLine();
        System.out.println("enter the letters you want to check starts with");
        String endString=scanner.nextLine();
        System.out.println("the starts with word" + obj.getStarted(startString,endString));
System.out.println("case 9 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 9");
 }   
 break;}
    
    case 10:
       {
try
{       
        System.out.println("enter the end1string");
        String end1String=scanner.nextLine();
        System.out.println("enter the letters you want to check ends with");
        String end2String=scanner.nextLine();
        System.out.println("the sentence ends with" + obj.getEnded(end1String,end2String));
System.out.println("case 10 try block executed");}
       catch(Exception exception)
{ 
System.out.println("exception thrown 10");
 }   
         break;}
    case 11:  
         {
try{
String low=scanner.nextLine();
         System.out.println("the string lowercaseis" + obj.getSmall(low)); 
System.out.println("case 11 try block executed");}
          catch(Exception exception)
{ 
System.out.println("exception thrown 11");
 }   
  break;}
    case 12:
          {
try
{
String high=scanner.nextLine();
System.out.println("the string upper case" + obj.getCapital(high));
System.out.println("case 12 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 12");
 }   
 break;}
    
    case 13:
       { try
{
String rev=scanner.nextLine();
       System.out.println("the original string is" +rev);
       String reverseString="";
        System.out.println("the reversestring is" + obj.getReverseStr(rev,reverseString));
System.out.println("case 13 try block executed");}
        catch(Exception exception)
{ 
System.out.println("exception thrown 13");
 }   
break;}
     
     case 14:
      {try
{
 String inputString=scanner.nextLine();
       String checkString=scanner.nextLine();
       System.out.println("the number of strings" + obj.getMultiStrings(inputString,checkString));
System.out.println("case 14 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 14");
 }   	
break;  }           
     
     case 15:
          {try
{
 System.out.println("enter the sentence contains spaces"); 
           String myinput=scanner.nextLine();
           System.out.println("the sentence without spaces" + obj.getSpaces(myinput));
System.out.println("case 15 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 15");
 }            
break;  }
     case 16:   
          { try{
          
String strength=scanner.nextLine();
  String[] correct=obj.getSplited(strength);
   for(String name:correct)
              {System.out.println(name);
             
              // System.out.println("the string is" + (joining+swing+joining));}
                //joiningSymbol=scanner.nextLine();
                }
               //System.out.println(obj.getSplited(joiningSymbol,correct)); 
System.out.println("case 16 try block executed");
}
          catch(Exception exception)
{ 
System.out.println("exception thrown 16");
 }   
           break;}
     case 17:
         {try{
          System.out.println("enter the number");          
          int number=scanner.nextInt();
          //scanner.nextLine();
          String[] stringInput=new String[number];//{"hello world","java","program"};
          for(int i=0;i<stringInput.length;i++){
          System.out.println("enter the strings");
          stringInput[i]=scanner.nextLine();
          }
          for(String str:stringInput)
          {
          System.out.println(str);}
          String joinStr=scanner.nextLine();    
	  String resultStr=obj.getMerged(stringInput,joinStr);
System.out.println(resultStr);
}
catch(Exception exception)
{ 
System.out.println("exception thrown 17");
 }   
 break;}
      case 18:
           {try{
System.out.println("enter a 18 method first string:");
           String stringInput =scanner.nextLine();
           System.out.println("enter a 18 method second string:");
           String compareInput=scanner.nextLine();  
           System.out.println("if equal or not" + obj.getEquality(stringInput,compareInput));
System.out.println("case 18 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 18");
 }              
break;}
      
      case 19:  
          {try
{
 System.out.println("enter a 19 method first string:");
           String inputString=scanner.nextLine();
           System.out.println("enter a 19 method second string:");
           String equalInput=scanner.nextLine();
           System.out.println("the check equal or not" + obj.getStrEqualityIgnore_1(inputString,equalInput));
System.out.println("case 19 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 19");
 }   		
break;      }
      case 20:
          { try
{
System.out.println("enter a 20 method string with double quotes:");
String replacedInput=scanner.nextLine();
System.out.println("the space trimmed is:" + obj.getNoSpaced(replacedInput));
System.out.println("case 20 try block executed");}
catch(Exception exception)
{ 
System.out.println("exception thrown 20");
 }   		
break;}            
}
}
}









