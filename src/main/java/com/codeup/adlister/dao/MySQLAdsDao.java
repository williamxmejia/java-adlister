package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM adlister_db.ads", PreparedStatement.NO_GENERATED_KEYS);
//
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        long id = ad.getId();
        long user_id = ad.getUserId();
        String title = ad.getTitle();
        String description = ad.getDescription();
        String query = "INSERT INTO adlister_db.ads(user_id, title, description) VALUES(?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setLong(1, user_id);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, description);
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
            System.out.println("The key of the new insert is: " + key);
            System.out.println(title);
            return key;
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    public static void main(String[] args) {
        Config config = new Config();
        MySQLAdsDao adsDao = new MySQLAdsDao(config);
        List<Ad> allAds = adsDao.all();
        System.out.println(allAds);
    }

    private String createInsertQuery(Ad ad) {
        String query = "INSERT INTO ads(?, ?, ?) VALUES ";
        return "INSERT INTO ads(user_id, title, description) VALUES "
            + "(" + ad.getUserId() + ", "
            + "'" + ad.getTitle() +"', "
            + "'" + ad.getDescription() + "')";
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
            rs.getLong("id"),
            rs.getLong("user_id"),
            rs.getString("title"),
            rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}
