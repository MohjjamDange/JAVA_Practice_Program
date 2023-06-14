#include<iostream>

using namespace std;

class Demo
{
    public:
     
    int x;
    int y;
    int m;
    int n;

    Demo(int iNo1, int iNo2)
    {
        x = iNo1;
        y = iNo2;
    }

    Demo(Demo &ref)
    {
        m = ref.x;
        n = ref.y;
        
    }
};


int main()
{    
    
    Demo dobj(11,22);

    Demo dobj2(dobj);

    cout<<dobj2.m<<endl;
    cout<<dobj2.n<<endl;
}
       

      
