import java.lang.*;

class DL32
{
    public static void main(String a[])
    {
        Employee eobj = new Employee(21000,"Rahul",212);

        System.out.println("Name"+eobj.Ename);
        System.out.println("Roll No"+eobj.Roll);
        System.out.println("Salary is:"+eobj.Esalary);
        
        try
        {
            Employee eobjx = (Employee)eobj.clone();

            System.out.println("Name"+eobjx.Ename);
            System.out.println("Roll No"+eobjx.Roll);
            System.out.println("Salary is:"+eobjx.Esalary);
        }
        catch(CloneNotSupportedException obj)
        {
            System.out.println(obj);
        }
    }

} 

class Employee implements Cloneable
{
    public int Esalary;
    public String Ename;
    public int Roll;

    public Employee(int s, String str,int r)
    {
        Esalary = s;
        Ename = str;
        Roll = r;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();

    }
}

