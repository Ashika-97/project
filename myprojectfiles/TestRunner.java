package Test;
import birds.Bird;
import child.Parrot;
public class TestRunner
{
public static void main(String[] args)
{
 System.out.println("TestRunner is Running");
 Bird one= new Bird();
 one.fly();
 Parrot two = new Parrot();
 two.speak();
 }
 }
 
