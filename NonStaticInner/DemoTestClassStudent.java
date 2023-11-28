 public class DemoTestClassStudent{
private int id=101;

public static void main(String args[]){

System.out.println("I am a Satish Kumar ");

TestClass2 tc2 = new DemoTestClassStudent().new TestClass2();
tc2.show();

}

public class TestClass2 extends Student{
private int id = 102;

public void show(){

int id=103;
System.out.println(id);
System.out.println(this.id);
System.out.println(DemoTestClassStudent.this.id);
System.out.println(getMarks());
}}}
