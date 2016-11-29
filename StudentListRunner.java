//Ethan Bhavsar 11/21/16 Mr. Ettlin AP Computer Science
import java.util.*;
public class StudentListRunner 
{
    public static void main(String args[]) 
    {
        System.out.print("\f");
        menuNumber();
    }
    public static void menuNumber() 
    {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);
        String input = " ";
        while(!input.equals("q")) 
        {
            System.out.println("1. Add a student");
            System.out.println("2. Print student list");
            System.out.println("3. Delete student");
            System.out.println("4. Filter students");
            System.out.println("q: End program");
            System.out.println("What would you like to do?");
            input = sc.nextLine();
            //Clears the screen
            System.out.print("\f");
            if(input.equals("1")){
                String name;
                int id;
                double gpa;
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("\nID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("\nGPA: ");
                gpa = sc.nextDouble();
                System.out.println();
                list.addStudent(name, id, gpa);
            }
            else if(input.equals("2")) 
            {
                System.out.print("\f");
                list.printStudent();
            }
            else if(input.equals("3"))
            {
                System.out.print("\f");
                System.out.println("What is the name of the student you want to delete?");
                String msg = sc.nextLine();
                list.deleteStudentFromList(msg);
            }
            else if(input.equals("4"))
            {
                System.out.print("\f");
                System.out.println("Enter the student's id");
                int num = sc.nextInt();
                list.filterNumber(num);
            }
        }
    }
}