class Main
{
  public static void main(String[] args)
  {
    Student obj = new Student();
    obj.getResults();
  }
}

interface IStudent 
{
  int getResults();
  String getsStatus();
}

class Student implements IStudent 
{
  public int getResults()
  {
    System.out.println("getResults");
    return 0;
  }

  public String getsStatus()
  {
    System.out.println("getsStatus");
    return "hello";
  }

  String ID, course;
  int result;
  String status;
}

abstract class Person
{
  String name,surname,age,gender;
}
