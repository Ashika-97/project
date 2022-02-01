package stringset1;

public class CrossPattern {
    public static void main(String[] args) {
    	
    	String name="abcde";
        int h=0,l=0;
        int len=name.length();
        char[] ch=new char[len*len];
        for(int i=0;i<len;i++)
        {
        	h=len-i-1;
        	for(int k=0;k<len;k++)
        	{
        		if(i==k || h==k)
        	
        		{
        	
        		ch[l]=name.charAt(k);
        		l++;
        		}
        		
        	else
        	{
        		ch[l]=' ';
        		l++;
        	}
        	}
        }
        System.out.println(String.valueOf(ch));
    }
}
        
        
        
        
        