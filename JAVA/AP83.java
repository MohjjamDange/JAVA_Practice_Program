import java.lang.*;
class AP83
{
    public static void main(String a[]) throws CloneNotSupportedException
    {
        Employee eobj = new Employee(21000,"Suresh",15);

        System.out.println("Employee Name :"+eobj.sName+"Employee Salary"+eobj.iSalary+"ID is :"+eobj.iId);

        try
        {
            Employee eobjX = (Employee)eobj.clone();
            System.out.println("Employee Name :"+eobjX.sName+"Employee Salary"+eobjX.iSalary+"ID is :"+eobjX.iId);


        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e);
        }
          
   }

}

class Employee implements
{
    public int iSalary;
    public String sName;
    public int iId;

    public Employee(int a, String str, int b)
    {
        this.iSalary = a;
        this.sName = str;
        this.iId = b;


    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }




}


