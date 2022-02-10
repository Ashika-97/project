package inheritPack;
import java.io.*;
import java.util.*;
import car.*;
import fileHandling.CustomException;
import abstractPack.ParrotMod;
import abstractMethodPack.Duck;
public class RunInherit {
	static Scanner scan=new Scanner(System.in);
	static  Swift swift=new Swift();
	static SCross scross=new SCross();
	 static XUV zen=new XUV();
	 static Car car=new Car();
	 Car object=new Swift();
	 Car obj=new SCross();
    ParrotMod mode=new ParrotMod();
    Duck duck=new Duck();
	//BirdAbstract bird=new BirdAbstract();
	//String str="scanner";
	//XUV zen2=new XUV(str);
	
	public void swiftDetails()
	{
	    System.out.println("enter a seat number");
	    int numberOfSeat=scan.nextInt();
	    scan.nextLine();
	    swift.setSeats(numberOfSeat);
	    System.out.println("enter a model type");
	    String modelNumber=scan.nextLine();
	    swift.setModel(modelNumber);
	    System.out.println("enter a color you want");
	    String stringcolour=scan.nextLine();
	    swift.setColor(stringcolour);
	    System.out.println("enter a airbags");
	    String airBags=scan.nextLine();
	    swift.setAirbags(airBags);
	    System.out.println("the no.of the seats car have is " + swift.getSeats());
	    System.out.println("the model of the car is " + swift.getModel());
	    System.out.println("the color of the car is " +  swift.getColor());
	    System.out.println("the no.of airbags are " + swift.getAirbags());

}
	public void ScrossDetails()
	{
            System.out.println("enter a seat number");
		    int numberOfSeat=scan.nextInt();
		    scan.nextLine();
		    scross.setSeats(numberOfSeat);
		    System.out.println("enter a model type");
		    String modelNumber=scan.nextLine();
		    scross.setModel(modelNumber);
		    System.out.println("enter a color you want");
		    String stringcolour=scan.nextLine();
		    scross.setColor(stringcolour);
		    System.out.println("enter a airbags");
		    String airBags=scan.nextLine();
		    scross.setAirbags(airBags);
		    System.out.println("enter a year of make");
		    int num=scan.nextInt();
		    scan.nextLine();
		    scross.setYearOfMake(num);
		    System.out.println("enter a cartype");
		    String type=scan.nextLine();
		    scross.setCarType(type);
		    System.out.println("enter a engine model");
		    String engineType=scan.nextLine();
		    scross.setEngineNumber(num);
		    System.out.println("the no.of the seats car have is " + scross.getSeats());
		    System.out.println("the model of the car is " + scross.getModel());
		    System.out.println("the color of the car is " +  scross.getColor());
		    System.out.println("the no.of airbags are " + scross.getAirbags());
		    System.out.println("the no.of yearofmake are " + scross.getYearOfMake());
		    System.out.println("the no.of cartype are " + scross.getCarType());
		    System.out.println("the no.of enginenumber are " + scross.getEngineNumber());
	
}

	public void carObject(Car carInput)
	{
		System.out.println(carInput);
		System.out.println("the object of the car method created");
		//System.out.println("car is running");
	}

  public void checkwhichCar(Car carAccess)
  {
	  if(carAccess instanceof Swift)
	  {
	 System.out.println("the swift instance presents : Hatch");
	  }
	  if(carAccess instanceof XUV)
	  {
	 System.out.println("the swift instance presents : suv");
	  }
	  if(carAccess instanceof SCross)
	  {
	 System.out.println("the swift instance presents : sedan");
	  }
  }
  //5
 public void swiftObject(Swift swiftcar)
 {
	 System.out.println(swiftcar);
	 System.out.println("swift object method process");
 }
		
public void checkingscross() 
{
	scross.maintenance();
	obj.maintenance();
	car.maintenance();
	swift.maintenance();
}
	
	/*public void overloadedMethod()
	{
		System.out.println("enter a string");
		String str=scan.nextLine();
		System.out.println(car.Car(str));//overloaded constructor called using car
		System.out.println(zen.XUV(str));//overloaded constructor calling using XUV
	}*/
	
	public void birdsMethod()
	{
		mode.fly();
		mode.speak();
	}
	
public void duckAbstractMethod()
{
	duck.fly();
	duck.speak();
}
	
	
	
public static void main(String[] args)
{
	RunInherit run=new RunInherit();
	System.out.println("enter a number 1 to 9");
	int number=scan.nextInt();
	scan.nextLine();
	
switch(number)
{
case 1:run.swiftDetails();
       break;
case 2:run.ScrossDetails();
       break;
case 3:run.carObject(swift);
       run.carObject(scross);
       run.carObject(zen);
       break;
case 4:run.checkwhichCar(scross);
       run.checkwhichCar(swift);
       //run.checkwhichCar(zen);
       break;
case 5:run.swiftObject(swift);
       //run.swiftObject(obj); 
       //run.swiftObject(XUV);
case 6:run.checkingscross();
       break;
       
case 7:
	XUV zen1=new XUV();
	System.out.println(zen1);
    break;
     
case 8:run.birdsMethod();
       break;
case 9:run.duckAbstractMethod();
       break;
    
    }
  }

}