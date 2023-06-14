import java.sql.*;

class JL151
{
    public static void main(String a[])
    {
        String URL = "JDBC :mysql: //localhost:3306/pp41";
        String Username = "root";
        String Password = "root";
        String Query = "select * from Student";

        Connection cobj = DriverManager.getConnection(URL,Username,Passward);

    }


}