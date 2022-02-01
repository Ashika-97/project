package stringset1;

public class Equal {
     public static void main(String[] args)
     {
    	 String[] word1= {"ab","c","de"};
    	 String[] word2= {"a","bc","d","e"};
         String  name="";
         String name1="";
         for(int i=0;i<word1.length;i++)
         {
        	 name=name+word1[i];
         }
         for(int j=0;j<word2.length;j++)
         {
        	 name1=name1+word2[j];
         }
         System.out.println(name.equals(name1));
     }
}