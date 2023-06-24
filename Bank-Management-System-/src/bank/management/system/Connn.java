package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            //jdbc:mysql://localhost:3306/?user=root

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","123456");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
