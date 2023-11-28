 public class DemoTestClassInterface{
private int id=101;

public static void main(String args[]){

System.out.println("I am a Satish Kumar ");

TestClass2 tc2 = new DemoTestClassInterface().new TestClass2();
System.out.println(tc2.getEmployeeID());
tc2.CalculateSalary();
}

public class TestClass2 implements Employee{
private int id = 102;

public void show(){

}
public int getEmployeeID(){

return id;
}

public void CalculateSalary()
{

System.out.println("Salary is 1 Lakh");

}
}}