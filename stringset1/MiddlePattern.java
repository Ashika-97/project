package stringset1;
import java.util.*;
public class MiddlePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="program";
		String inp="";
		int num=S.length()/2;
		String input=S.substring(0,num);
		String name=S.substring(num);
		name+=input;
		//System.out.println(name);
		for(int i=0;i<S.length();i++)
		{
			inp=name.substring(0,i+1);
			System.out.println(inp +"&");
		}
	}
}
