import java.lang.*;
import java.net.*;


class AP93
{
    public static void main(String args[])
    {
        System.out.println("Server Application Runnning");
        ServerSocket ss = new ServerSocket(2100);
        System.out.println("Server is Runnning At Port Number 2100 and waiting for client Request");
        Server s = ss.accept();
        System.out.println("Request of Client get Accepted");

        PrintStream ps = new PrintStream(s.getOutputStream());
        
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStreamReader()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1,str2;

        while(str1 = br1.readLine() != null)
        {
            System.out.println("Client Say's"+str1);
            System.out.println("Enter Your Massage Client");
            str2 = br2.readLine();
            ps.println(str2);

        }



    }

}