package Sms;
import java.util.*; 
import java.io.*; 
import java.time.LocalDate;
import java.time.Period;


class Main
{
  public static void main(String[] args)
  {
        //Calling EDT 
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Menu().setVisible(true);    //Declaring menu, calling menu, and set frame to visable
            }
        });
  }
}

class List
{
   ArrayList<Student> studentList = new ArrayList<>();  //Declaring an arraylist to store linkedlists of students
   String fileName = "./students.csv";
   //declaring variables for node index values of data.
   int namePos = 0,
   surnamePos = 1,
   genderPos = 2,
   birthDatePos = 3,
   agePos = 4,
   idPos = 5,
   coursePos = 6,
   resultPos = 7,
   statusPos = 8;
   
   String load(String fileName)
   {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
    {
        String line;    //A variable to store line from file
        //Loop to go through the entire file
        while((line = br.readLine()) != null)
        {
            String[] data = line.split(",");    //Split the data to variables, marked by ","
            newStudent(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);    //Call newstudent and pass the array as data
        }
    } 
    
    catch (Exception e) //Catch error
    {
      System.out.println(e.toString());
    }
    return "";
   }
   
   //Save the linkedlists in a readable format as .csv
   void save(String fileName)
   {
       globalDelNode(agePos);   //Delete age node from all linked lists
       //Write each node to file in the correct format
       try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
       {
           for(int i = 0; i < studentList.size();i++)
           {
               for(int j = 0;j < studentList.get(i).studentInfo.size();j++)
               {
                   if(j == studentList.get(i).studentInfo.size() -1)
                   {
                       bw.write(studentList.get(i).studentInfo.get(j));
                   }
                   else
                   {
                       bw.write(studentList.get(i).studentInfo.get(j) + ",");
                   }
               }
               bw.write("\n");
               insertAge(i);
           }
       }
       catch (Exception e)  //Catch error
       {
           System.out.println(e.toString());
       }
   }
   
   //Create a new student with the format: Name,Surname,Gender,Birthdate,ID,Course,Result,Status
   void newStudent(String name, String surname, String gender, String birthDate, String ID, String course, String result, String status)
   {
       studentList.add(new Student(name,surname,gender,birthDate,ID,course,result,status));
   }
   
   void removeStudent(int index)
   {
       studentList.remove(index);    //Removes the linkedlist of specified index
   }
   
   int totalStudents()
   {
       return studentList.size();  //Return the size of studentList
   }
   
   void setNode(int index, int node, String value)
   {
       studentList.get(index).setNode(node, value);  //Call a specific linkedlist, and change a specific node
   }
   
   void delNode(int index, int node)
   {
       studentList.get(index).delNode(node);    //Call a specific linkedlist, and delete a specific node
   }
   
   //Delete a specific nodes in all linkedlists
   void globalDelNode(int node)
   {
    for(int i = 0; i < studentList.size();i++)
    {
        studentList.get(i).delNode(node);
    }
   }
   
   String getNode(int index, int node)
   {
       return studentList.get(index).getNode(node); //Get the value of a specific linkedlist node
   }
   
   Object[] returnArray(int index)  //Return a specific linkedlist as an array
   {
       return studentList.get(index).studentInfo.toArray();
   }
   
   Student returnIndex(int index)   //Return a specific linkedlist
   {
       return studentList.get(index);
   }
   
   //Set the node that contains the age value with calculated age based on birthdate node and local time.
   void setAge(int index)
   {
       setNode(index,agePos,Integer.toString(Period.between(LocalDate.parse(getNode(index,birthDatePos)), LocalDate.now()).getYears()));
   }
   
   //Inserts a node that contains the age value with calculated age based on birthdate node and local time.
   void insertAge(int index)
   {
       studentList.get(index).addNode(agePos,Integer.toString(Period.between(LocalDate.parse(getNode(index,birthDatePos)), LocalDate.now()).getYears()));
   }
   
   //Calculate age based on provided birthdate and localtime
   String calculateAge(String birthdate)
   {
      return Integer.toString(Period.between(LocalDate.parse(birthdate), LocalDate.now()).getYears());
   }
           
   void exit()
   {
       System.exit(0);  //Exit the program
   }
}

interface IStudent 
{
  String getResults();
  String getsStatus();
}

class Student extends Person implements IStudent 
{
 //Add new student
 Student(String name, String surname, String gender, String birthDate, String ID, String course, String resultTmp, String statusTmp)
 {
  studentInfo.add(name);
  studentInfo.add(surname);
  studentInfo.add(gender);
  studentInfo.add(birthDate);
  studentInfo.add(Integer.toString(Period.between(LocalDate.parse(birthDate), LocalDate.now()).getYears()));
  studentInfo.add(ID);
  studentInfo.add(course);
  studentInfo.add(resultTmp);
  studentInfo.add(statusTmp);
 }
 //Declaring variables for node index values of data.
 int namePos = 0,
     surnamePos = 1,
     genderPos = 2,
     birthDatePos = 3,
     agePos = 4,
     idPos = 5,
     coursePos = 6,
     resultPos = 7,
     statusPos = 8;
 
 void setNode(int index, String value)
 {
   studentInfo.set(index, value);   //Set a value of a specific node
 }
 
 void addNode(int index,String value)
 {
     studentInfo.add(index,value);  //Insert a node
 }
 
 String getNode(int node)
 {
   return studentInfo.get(node);    //Get a value of a specific node
 }
 
 String delNode(int node)
 {
   return studentInfo.remove(node); //Delete a specific node
 }
 
 @Override //Override the getResults function from IStudent
 public String getResults()
 {
   return studentInfo.get(resultPos);   //Return result node
 }
 @Override //Override the getStatus function from IStudent
 public String getsStatus()
 {  
   return studentInfo.get(statusPos);   //Return status node
 }
 @Override  //Override the toString function
 public String toString()
 {
   return studentInfo.toString(); //Return studentinfo as a string
 }
}

abstract class Person
{
    protected LinkedList<String> studentInfo = new LinkedList<>();  //Create a linked list to storage student's data
}
