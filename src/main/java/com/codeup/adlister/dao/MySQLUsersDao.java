package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLUsersDao implements Users{
    private Connection connection = null;

    public MySQLUsersDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException e){
            throw new RuntimeException("Error connecting to database...", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String query = "SELECT * FROM adlister_db.users WHERE username= ?";
        User user = null;
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                user = new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }
        }catch (SQLException e){
            throw new RuntimeException("error connecting to bd", e);
        }
        return user;
    }

    @Override
    public List<User> all() {
        PreparedStatement stmt = null;
        try {
            stmt =connection.prepareStatement("SELECT  * FROM adlister_db.users", PreparedStatement.NO_GENERATED_KEYS);
            ResultSet rs= stmt.executeQuery();
            return createUsersFromResults(rs);
        }catch (SQLException e){
            throw new RuntimeException("Error retrieving all users");
        }
    }


    @Override
    public Long insert(User user) {
        long id = user.getId();
        String username = user.getUsername();
        String email = user.getEmail();
        String password = user.getPassword();
        String query = "INSERT INTO adlister_db.users(username, email, password) VALUES(?, ?, ?)";
        long key = 0;
        try{
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1,username);
            stmt.setString(2,email);
            stmt.setString(3,password);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            key = rs.getLong(1);
            return key;
        }catch (SQLException e){
            throw new RuntimeException("Error creating new user");
        }

    }

    private User extractUsers(ResultSet rs) throws SQLException{
        return new User(
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    private List<User> createUsersFromResults(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();
        while(rs.next()){
            users.add(extractUsers(rs));
        }
        return users;
    }
}
