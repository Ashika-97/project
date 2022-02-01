package stringset1;

public class ShuffleCode {

	public static void main(String[] args) {
		
		String name="codeleet";
		int[] indices=new int[] {4,5,6,7,0,2,1,3};
		char[] ch=new char[name.length()];
		int index=0;
		for(int i:indices)
		{
			ch[i]=name.charAt(index);
			index++;
		}
		System.out.println(String.valueOf(ch));
}
}
/*char[] result= new char[name.length()];
 int index=0;
 
 for(int i :indices){
    result[i]=name.charAt(index);
     index++;
 }
 System.out.println(String.valueOf(result));
}
}*/
