package mathematicalProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MathematicalProblem2Run {
	MathematicalProblemLogic logic=new MathematicalProblemLogic();
	static Scanner scan=new Scanner(System.in);
	
	
	
	//1
	public void daysCalculate()
	{
		System.out.println("Enter the first date");
		int d1=scan.nextInt();
		System.out.println("Enter the 1st month");
		int m1=scan.nextInt();
		System.out.println("Enter the 1st year");
		int y1=scan.nextInt();
		System.out.println("Enter the second date");
		int d2=scan.nextInt();
		System.out.println("Enter the 2nd month");
		int m2=scan.nextInt();
		System.out.println("Enter the 2nd year");
		int y2=scan.nextInt();
		System.out.println(logic.monthDaysCalculate(d1, m1, y1, d2, m2, y2));
	}
	
	
	
	
	
	
	
	
	//8
	public void gridChess()
	{
		System.out.println("Enter the number of length Chess ");
		int N=scan.nextInt();
		System.out.println("Enter the queen position in x-axis ");
		int x=scan.nextInt();
		System.out.println("Enter the queen position in y-axis");
		int y=scan.nextInt();
		//System.out.println("Enter the obstacles positions");
		int[] kx=new int[4];
		//System.out.println("Enter the obstacles position ");
		int[] ky=new int[4];
		System.out.println(logic.searchGrid(N,x,y,kx,ky));
	}
	
	
	
	
	
	
	//10
	public void hexToBin()
	{
		try {
		System.out.println("Enter the String ");
		String name=scan.nextLine();
		name=name.toUpperCase();
		System.out.println("the name is "+ name);
		System.out.println(logic.hexToBinary(name));
		}
		catch(Exception e)
		{
			System.out.println("Exception in converting hexadecimal to binary");
		}
	}
	
	public void bintoHex()
	{
		try {
		System.out.println("Enter the int ");
		String num=scan.nextLine();
		System.out.println(logic.binarytoHex(num));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	//5
	public void palindromeNumber()
	{
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		System.out.println(logic.palindromeNumbers(n));
	}
	
	//6
	public void uglyCheck()
	{
		System.out.println("Enter the number to check ugly ");
        int n=scan.nextInt();
        System.out.println(logic.uglyCount(n));
	}
	//7
	public void divisibleBy8()
	{
		System.out.println("Enter the num");
		int n=scan.nextInt();
		System.out.println(logic.divisibleBy8(n));
		
//		for(int i=0;i< list1.size();i++)
//		{
//			System.out.println(list1.get(i));
//		}
	}
	
	//11
	public void largestNumberFind()
	{
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		System.out.println("Enter the next greater number to find ");
		int d=scan.nextInt();
		System.out.println(logic.nextGreaterNumber(n, d));
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		MathematicalProblem2Run task=new MathematicalProblem2Run();
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		scan.nextLine();
		
		switch(n)
		{
		
		
		case 1:task.daysCalculate();
		       break;
		case 5:task.palindromeNumber();
		break;
		case 6: task.uglyCheck();
		break;
		case 7: task.divisibleBy8();
		break;
		case 8: task.gridChess();
		case 9: task.bintoHex();;
		break;
		case 10:task.hexToBin();;
		break;
		
		case 11:task.largestNumberFind();
		break;
		}
		
		
		
		
	}

}
