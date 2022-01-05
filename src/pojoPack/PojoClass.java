package pojoPack;

public class PojoClass {

	
	private String name;
	   // private int number;
	    private int no;


	    public PojoClass() {
			
		} 
	public void setName(String name1){
	        this.name=name1;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setid(int number){
	        this.no=number;
	    }
	    public int getid(){
	        return no;
	    }
	    public PojoClass(String name1,int no1){
	     this.name=name1;
	     this.no=no1;
	    }
	    

	   
		@Override
		public String toString() {
			return "PojoClass [name=" + name + ", no=" + no + "]";
		}
	}
