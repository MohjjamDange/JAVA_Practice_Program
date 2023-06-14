import java.lang.*;

class PL121
{
	public static void main(String a[])
	{
		float fRet = 0.00f;
		Area aobj = new Area();
		
		fRet = aobj.CircleArea(7.14f);
		System.out.println("Calcluated Area is : "+fRet);
		
	}
	
}

interface Circle
{
	float PI = 3.14f;
	
	float CircleArea(float redi);
	
}


class Area implements Circle
{
	public float CircleArea(float redi)
	{
		float ans = 0.00f;
		
		ans = PI * redi * redi;
		
		return ans;
		
	}
	
} 


