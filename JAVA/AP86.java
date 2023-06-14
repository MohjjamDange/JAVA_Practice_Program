import java.lang.*;

class AP86
{
    public static void main(String a[])throws CloneNotSupportedException
    {
        Employee eobj = new Employee(21000,"Piyush",15);

        
        try
        {

             Employee eobjX = (Employee)eobj.clone();

            System.out.println("Name of Employee :"+eobjX.sName);
             System.out.println("ID of Employee :"+eobjX.iID);
            System.out.println("Salary of Employee :"+eobjX.iSalary);


        }catch(CloneNotSupportedException e)
        {
            System.out.println(e);
        }
    }
}   





class Employee implements Cloneable
{
    public int iSalary;
    public int iID;
    public String sName;

    public Employee(int a,String str,int b)
    {
        this.iSalary = a;
        this.sName = str;
        this.iID = b;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }



}



   