import java.lang.*;

class AP29
{
    public static void main(String a[])
    {
        Employee eobj = new Employee(12,"Sabir",22000);
        System.out.println("ID is : "+eobj.iID+" Name is :"+eobj.sName+" Salary is :"+eobj.iSalary);

        try
        {
            Employee eobjx = (Employee)eobj.clone();
            System.out.println("ID is : "+eobjx.iID+" Name is :"+eobjx.sName+" Salary is :"+eobjx.iSalary);
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }    


    }

}


class Employee implements Cloneable
{
    public int iID;
    public int iSalary;
    public String sName;

    public Employee(int a,String b,int c)
    {
        iID = a;
        iSalary = c;
        sName = b;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }


}

