/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result;
import java.until.scanner;

/**
 *
 * @author sksba
 */
public class NewClass {
    
}
   public static void main(string[]args)
{
    result obj=new result();
    obj.getdetails();
    obj.getmark();
    obj.display();

}

     class student
     {
         string name;
         int rollno;
         void getdetails()
     }
         scanner sc= new scanner(system.in);
    system.out.print("enter name without space:");
         name=sc.next();
    system.out.print("enter student rollno:");
         rollno=sc.nextInt();
}
}
class mark extends student
{
    int m1,m2,m3;
    void getmark()
    {
scanner sc=new scanner(system.in);
system.out.print("enter first mark:");
    m1=sc.nextln();
system.out.print("enter second mark:");
     m2=sc.nextInt();
system.out.print("enter third mark:");
     m3=sc.nextInt();
    }
}
class result extends mark
{
    double avg=0;
    
string final_result()

{
   avg=(double)(m1+m2+m3)/3;
   if(avg>=50)
       return "pass";
   if(avg<50)
       return"fail";
   return"";
}
void display()
{
system.out.println("student_details");
system.out.println("name:"+name);
system.out.println("roll no:"+rollno);
system.out.println("total mark:"+(m1+m2+m3));
final_result();
system.out.println("Average:"+(double)avg);
system.out.println("result:"+final_result());
}
}