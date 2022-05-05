import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> allAds = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while(rs.next()){
                Ad newAd = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                allAds.add(newAd);
            }
        }catch (SQLException e){
            throw new RuntimeException("error connecting to db", e);
        }
        return allAds;
    }

    @Override
    public Long insert(Ad ad) {
        String query = "INSERT INTO adlister_db.ads (user_id, title, description) VALUES (" + ad.getUserId() + ",'" + ad.getTitle() + "', '" + ad.getDescription() + "')";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
            return key;
        } catch (SQLException e){
            throw new RuntimeException("error connecting to db", e);
        }
    }
}
