package stringset1;

public class ReverseSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String result="help others";
        char[] ch=result.toCharArray();
        int num=result.length()-1;
        int num1=0;
        //int temp=0;
        while(num1<num)
        	{
        	if(ch[num]==' ')
        	{
        		num++;
        	}
        	if(ch[num1]==' ')
        	{
        		num1++;
        	}
        	
        	if(ch[num1]!=' ' && ch[num]!=' ')
        	{
        	 char ch1=ch[num1];
        	 ch[num1]=ch[num];
        	 ch[num]=ch1;
        	 num1++;
        	 num--;
        	}
        	}
        System.out.println(String.valueOf(ch));
	}

}
