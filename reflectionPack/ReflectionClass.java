package reflectionPack;

public class ReflectionClass {


	private String name;
	    private int number;
	    public  ReflectionClass() {
	    	
	    }

	    public ReflectionClass(String name,int number){
		     this.name=name;
		     this.number=number;
		    }
		    
	 public void setName(String name){
	        this.name=name;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setid(int number){
	        this.number=number;
	    }
	    public int getid(){
	        return number;
	    }
	   

	    @Override
		public String toString() {
			return "PojoClass [name=" + name + ", number=" + number + "]";
		}
	}