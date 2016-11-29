import java.util.Scanner;
import java.util.ArrayList;

public class Student
{
    int stuID;
    double stuGPA;
    String fName;
    String mName;
    String lName;
    
    public Student()
    {
        
    }
    
    public int getID()
    {
        return stuID;
    }
    public double getGPA()
    {
        return stuGPA;
    }
    public String getFName()
    {
        return fName;
    }
    public String getMName() 
    {
        return mName;
    }
    public String getLName()
    {
        return lName;
    }
    public String getName()
    {
        if(mName.equals("")) 
        {
            return fName + " " + lName;
        }
        return fName + " " + mName + " " + lName;
    }
    
    public void setID(int id)
    {
        stuID = id;
    }
    public void setGPA(double gpa)
    {
        stuGPA = gpa;
    }
    public void setFName(String first)
    {
        fName = first;
    }public void setMName(String middle) 
    {
        mName = middle;
    }
    public void setLName(String last) 
    {
        lName = last;
    }
}