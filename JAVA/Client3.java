import java.lang.*;
import java.net.*;


class Client
{
    public static void main(String args[])
    {
        System.out.println("Client Application Runnning");

        Socket s = new Socket("localhost",2100);
        System.out.println("Client is Waiting For the Server Accept the Request");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1,str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Server Says :"+str2);
            System.out.println("Enter Your Massage For Server");
           
        }

   }




}