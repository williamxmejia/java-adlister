import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDAO implements Authors {
    private Connection connection;

    public AuthorsDAO(){
        try{
            Config config = new Config();
            //Import the driver into our app
            DriverManager.registerDriver(new Driver());
            //Create the connection object
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

    @Override
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.authors");
            while (rs.next()){
                Author author = new Author(
                        rs.getLong("id"),
                        rs.getString("author_name")
                );
                authors.add(author);
            }

        }catch (SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
        return authors;
    }

    @Override
    public void insert(Author author) {

    }
}
