package mathematicalProblem;

import java.util.Scanner;

public class MathematicalRun {
       MathematicalLogic input=new MathematicalLogic();
       static Scanner scan=new Scanner(System.in);
       
       //1
       public void numberOfPathsFind()
       {
    	   System.out.println("Enter the number of rows");
    	   int n=scan.nextInt();
    	   System.out.println("Enter the number of columns ");
    	   int m=scan.nextInt();
    	   System.out.println(input.numberOfPaths(m, n));
       }
       //2
       public void squareFloor()
       {
    	   System.out.println("Enter the number ");
    	   int n=scan.nextInt();
    	   System.out.println(input.square(n));
       }
       //3
       public void balancedString()
       {
    	   System.out.println("Eter the String ");
    	   String name=scan.nextLine();
    	   System.out.println(input.balancedStringNumber(name));
       }
       //4
       public void LuckyCheck()
       {
    	   System.out.println("Enter the number to check if it is lucky ");
    	   int n=scan.nextInt();
    	   System.out.println(input.isLucky(n));
       }
       //5
       public void palindromeBinary()
       {
    	   System.out.println("Enter the number ");
    	   int n=scan.nextInt();
    	   System.out.println(input.isPalindrome(n));
       }
       //6
       public void oddNumberOfFactors()
       { 
          System.out.println("Enter the number ");
          int n=scan.nextInt();
          System.out.println(input.oddNumberOfFactors(n));
       }
       //7
       
       public void openedDoordClosedDoors()
       {
    	   System.out.println("Enter the number ");
    	   int n=scan.nextInt();
    	   System.out.println(input.openedDoors(n));
       }
       
       //8
       
       public void perfectDigits()
       {
    	   System.out.println("Enter the number ");
    	   int n=scan.nextInt();
    	   System.out.println(input.perfectSquare(n));
       }
       //9
       public void perfectSquareCoOrd()
       {
    	   System.out.println("Enter the x co-ordinate");
    	   int x1=scan.nextInt();
    	   System.out.println("Enter the y co-ordinate");
    	   int y1=scan.nextInt();
    	   System.out.println("Enter the x co-ordinate");
    	   int x2=scan.nextInt();
    	   System.out.println("Enter the y co-ordinate");
    	   int y2=scan.nextInt();
    	   System.out.println("Enter the x co-ordinate");
    	   int x3=scan.nextInt();
    	   System.out.println("Enter the y co-ordinate");
    	   int y3=scan.nextInt();
    	   System.out.println("Enter the x co-ordinate");
    	   int x4=scan.nextInt();
    	   System.out.println("Enter the y co-ordinate");
    	   int y4=scan.nextInt();
    	   System.out.println(input.isSquare(x1, y1, x2, y2, x3, y3, x4, y4));
       }
       //10
       public void rectangulearVolume()
       {
    	   System.out.println("Enter the area");
    	   int a=scan.nextInt();
    	   System.out.println("Enter the perimeter");
    	   int v=scan.nextInt();
    	   System.out.println(input.getVol(a, v));
       }
       //11
       public void tourPetrol()
       {
    	   System.out.println("Enter the number of array ");
    	   int n=scan.nextInt();
    	   int[] petrol=new int[n];
    	   int[] distance=new int[n];
    	   for(int i=0;i<n;i++)
    	   {
    		   System.out.println("Enter th petrol");
    		   petrol[i]=scan.nextInt();
    		   System.out.println("Enter the distance ");
    		   distance[i]=scan.nextInt();
    	   }
    	   System.out.println(input.circleTour(petrol, distance));
       }
       
       
       //12
       public void powerOfAnotherNumber()
       {
    	   System.out.println("Enter the number ");
    	   long x=scan.nextLong();
    	   System.out.println("Enter the pchecking perfect number ");
    	   long y=scan.nextLong();
    	   System.out.println(input.isPowerOfAnother(x,y));
       }
       
       //13
       public void twistPrime()
       {
    	   System.out.println("Enter the number ");
    	   int n= scan.nextInt();
    	   System.out.println(input.twistedPrime(n));
       }
       
       
       
       
       
       
       
       
       
       public static void main(String[] args)
       {
    	   MathematicalRun run=new MathematicalRun();
    	   System.out.println("Enter the number ");
    	   int n=scan.nextInt();
    	   scan.nextLine();
    	   
    	   
    	   
    	   
    	   switch(n)
    	   {
    	   case 1:run.numberOfPathsFind(); 
    	    
    	   case 2:run.squareFloor();
    	   
    	   case 3:run.balancedString();
    	   
    	   case 4:run.LuckyCheck();
    	   
    	   case 5:run.palindromeBinary();
    	   
    	   case 6:run.oddNumberOfFactors();
    	   
    	   case 7:run.openedDoordClosedDoors();
    	   
    	   case 8: run.perfectDigits();
    	   
    	   case 9:run.perfectSquareCoOrd();
    	   
    	   case 10:run.rectangulearVolume();
    	   
    	   case 11:run.tourPetrol();
    		   
    	   case 12:run.powerOfAnotherNumber();
    	   
    	   case 13:run.twistPrime();
    	   }
    	   
       }
}
