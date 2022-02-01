package com.stringset2;

import java.util.*;

public class Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="III";
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        char ch='0';
     for(char c:s.toCharArray())
     { res+=map.get(c);
         if(ch!='0' && map.get(c)>map.get(ch))
        	 res-=2*map.get(ch);
     }
     System.out.println(res);

}
}
/* int result = 0;
char ch = '0';
for (char c: s.toCharArray()) {
    result+=map.get(c);
    if(ch != '0' && map.get(c) > map.get(ch)){
    result -=2*map.get(ch);
}
ch = c;
}

return result; 
}
}*/
