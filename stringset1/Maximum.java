package stringset1;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="geeksg";
   int no=0;
   for(int i=0;i<s.length();i++)
   {
	   no=Math.max(no, s.lastIndexOf(s.charAt(i))-i);
   }
      System.out.println(no-1);
	}
}
/*HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!hm.containsKey(ch))
                hm.put(ch,i);
            else
                max=Math.max(max,i-hm.get(ch)-1);
        }
        return max;
    }*/
