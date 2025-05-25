
/*Implement an EMPLOYEE class with an inner class named Department that handles 
department-related details. The inner class Department should: 
a. Contain fields for departmentName and location. 
b. Provide methods to set and display department details. 
The EMPLOYEE class should: 
Contain fields for eName (employee name), salary, and an array of Department objects. 
Provide methods to: 
c) Add departments. 
d) Display employee details along with department information. */
import java.util.*;
public class EMPLOYEE {
    String ename;
    int salary;
    department[] obj;
    int depcount;
    EMPLOYEE(String ename,int salary,int size)
    {
this.ename=ename;
this.salary=salary;
obj=new department[size];
depcount=0;
    }

    
    class department{
     
    String name;
    String loc;
    department(String name,String loc)
    {
        this.name=name;
        this.loc=loc;
        

    }
    void displaydetail()
    {
        System.out.println("name: "+name);
        System.out.println("location "+loc);

    } 
}
void adddepart(String name,String loc)
{
    if(obj.length>depcount)
    {
        obj[depcount++]=new department(name,loc);
    }
}
void displayemployee()
{ System.out.println("Employee Name: " + ename);
System.out.println("Salary: " + salary);
    for(int i=0;i<obj.length;i++)
    {
        obj[i].displaydetail();
    }


}
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
    System.out.println("enter name");
    String name=sc.nextLine();
    System.out.println("enter salary");
    int salary=sc.nextInt();
    System.out.println("enter deptcount");
   int ddeptcount=sc.nextInt();
    EMPLOYEE k=new EMPLOYEE(name,salary,ddeptcount);
    for(int i=0;i<ddeptcount;i++)
    {System.out.println("enter department name"+i);
        String dname=sc.nextLine();
        System.out.println("enter location");
        String location=sc.nextLine();
        k.adddepart(dname,location);

    }
 k.displayemployee();  
}

}

