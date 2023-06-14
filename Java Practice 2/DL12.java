import java.lang.*;

class DL12
{
    public static void main(String arg[])
    {
        float fRet = 0.0f;
        System.out.println("PI is :"+Area.PI);

        CalculateArea obj = new CalculateArea();
        fRet = obj.Circle(12.2f);
        System.out.println("Area of Circle is :"+fRet);
    }

}

interface Area
{
    float PI = 3.14f;
    
    float Circle(float redi);
}

class CalculateArea implements Area
{
    public float Circle(float redi)
    {
        
       return( redi * redi * PI);
        
    }

}

