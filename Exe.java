package pdf;
import java.sql.*;
public class Exe {
    public static void main(String[] args) throws SQLException {
    Connection connection = null;
    Connect uneCo = new Connect();
    try{
        //Connection to DataBase

        Class.forName("org.gjt.mm.mysql.Driver");
        connection = DriverManager.getConnection(uneCo.getDriverSGBDR(),uneCo.getUserName(),uneCo.getPassword());
        System.out.println("Connected!");
        //Show data
        String queryShow = "SELECT * FROM bateau";
        Statement stmtShow = connection.createStatement();
        ResultSet res = stmtShow.executeQuery(queryShow);
        while (res.next()){
            System.out.println("Nom : " + res.getString(1) + " / CapMax : " + res.getString(2) + " / CapMaxVeh - 2M : " + res.getString(3) + " / CapMaxVeh + 2M : " + res.getString(4));
        }
    }
    catch(ClassNotFoundException e){
        System.out.println("Class not found : " + e.getMessage());

    }
    catch(SQLException e){
        System.out.println("Unable to connect : " + e.getMessage());
    }

    finally{
        try{
            if(uneCo != null){
                connection.close();
                System.out.println("Connection ended!");
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
}
