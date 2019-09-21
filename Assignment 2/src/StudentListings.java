import javax.swing.JOptionPane;
import java.awt.*;

public class StudentListings
{
    private String Name;
    private String Id_Number;
    private String Gpa;


    public StudentListings()
    {
     Name = "";
     Id_Number = "";
     Gpa = "";
    }

    StudentListings(String n, String i, String g)
    {
        Name = n;
        Id_Number = i;
        Gpa = g;
    }

    public String toString()
    {
        return("\nStudent Name: " + Name + "." +
                "\nStudent ID: " + Id_Number + "." +
                "\nStudent GPA: " + Gpa + ".");
    }

    StudentListings deepCopy()
    {
        return new StudentListings(Name,Id_Number,Gpa);
    }

    int compareTo(String targetKey)
    {
        return(Name.compareTo(targetKey));
    }

    public void input ()
    {
        Name = JOptionPane.showInputDialog("Student name: ");
        Id_Number = JOptionPane.showInputDialog("ID number: ");
        Gpa = JOptionPane.showInputDialog("GPA: ");
    }

    //testing function ---//

    //public static void main(String[] args)
    //{
    //   StudentListings studentList = new StudentListings();
    //  studentList.input();
    //    System.out.println(studentList.toString());
    //   int name=studentList.compareTo("Jane Doe");
    //   studentList.deepCopy();

    //   if(name==0)
    //    {
    //       System.out.println("This name is already in the database");
    //   }
    //   else
    //        System.out.println("This name has been added to the database");
    //}
}
