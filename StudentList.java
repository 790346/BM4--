import java.util.ArrayList;
import java.util.Scanner;

public class StudentList
{
    ArrayList<Student> studs = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    public void addStudent(String name, int id, double gpa)
    {
        Student s = new Student();
        parseUserInput(name, s);
        s.setID(id);
        s.setGPA(gpa);
        studs.add(s);
    }

    public void printStudent()
    {
        for(int i = 0; i < studs.size(); i++) 
        {
            System.out.println("Name: " + studs.get(i).getName());
            System.out.println("ID: " + studs.get(i).getID());
            System.out.println("GPA: " + studs.get(i).getGPA());
            System.out.println("**************************************************************");
        }
    }

    public void deleteStudentFromList(String name)
    {
        boolean bool = false;
        for(int i = 0; i < studs.size(); i++)
        {
            if(name.equals(studs.get(i).getName()))
            {
                studs.remove(i);
                System.out.println("Student has been deleted!!! :D ^.^ ;3 :) xD ^_^");
                bool = true;
            }
        }
        if(bool == false)
        {
            System.out.println("This student is not in the list.");
        }
    }
    
    public void parseUserInput(String name, Student stu) 
    {
        if(name.indexOf(",") > -1)
        {
            stu.setLName(name.substring(0, name.indexOf(",")));
            String s = name.substring(name.indexOf(" ") + 1);
            stu.setFName(s.substring(0, s.indexOf(" ")));
            stu.setMName(s.substring(s.indexOf(" ") + 1));
        }
        else if(name.substring(name.indexOf(" ") + 1).indexOf(" ") > -1) 
        {
            stu.setFName(name.substring(0, name.indexOf(" ")));
            String s = name.substring(name.indexOf(" ") + 1);
            stu.setMName(s.substring(0, s.indexOf(" ")));
            stu.setLName(s.substring(s.indexOf(" ") + 1));
        }
        else 
        {
            stu.setFName(name.substring(0, name.indexOf(" ")));
            stu.setLName(name.substring(name.indexOf(" ") + 1));
            stu.setMName("");
        }
    } 
    
    public void filterNumber(int id)
    {
         for(int i = 0; i < studs.size(); i++)
         {
             if(id == studs.get(i).getID())
             {
                 System.out.println("What is the minimum student number?");
                 int input = sc.nextInt();
                 for(int j = 0; j < studs.size(); j++)
                 {
                     if(studs.get(j).getID() >= input || studs.get(j).getID() == input)
                     {
                         System.out.println("Here is your student: " + studs.get(i).getID());
                     }
                     else
                     {
                         System.out.println("No such student exists. :) (: ): :(");
                     }
                 }
             }
         }
    }
}
    
//     public void filterGPA(double gpa)
//     {
//          for(int i = 0; i < studs.size(); i++)
//          {
//              if(id == studs.get(i).getID())
//              {
//                  System.out.println("What is the minimum student number?");
//                  int input = sc.nextInt();
//                  for(int j = 0; j < studs.size(); j++)
//                  {
//                      if(studs.get(j).getID() >= input || studs.get(j).getID() == input)
//                      {
//                          System.out.println("Here is your student: " + studs.get(i).getID());
//                      }
//                      else
//                      {
//                          System.out.println("No such student exists. :) (: ): :(");
//                      }
//                  }
//              }
//          }
//     }
// }
