import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JDBCTest {
    // Test of Java Database Connectivity
    // We are going to need a Connection object, a Statement object, and a ResultSet object

    private static List<String> getAuthorNames(){
        List<String> authorNames = new ArrayList<>();
        try{
            Config config = new Config();
            //Import the driver into our app
            DriverManager.registerDriver(new Driver());
            //Create the connection object
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            //Create the Statement object
            Statement statement = connection.createStatement();
            //Execute statement and get results
            ResultSet rs = statement.executeQuery("SELECT author_name FROM codeup_test_db.authors");
            while(rs.next()){
                authorNames.add(rs.getString("author_name"));
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
        return authorNames;
    }

    public static void main(String[] args) {
        List<String> authorNames = getAuthorNames();
        for(String name : authorNames){
            System.out.println(name);
        }
    }
}
