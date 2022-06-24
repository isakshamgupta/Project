package com.sapient.asde.dao;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class PostgresConnection {
    private static Properties properties=null;
    //>= JDBC API 4 , JDBC drivers are implicitly loaded
    //Load PostgreSQL driver explicitly for downward compatibility
    static {
        try {
            properties= new Properties();
            Reader reader=
                    new FileReader("C:\\Users\\sakgupta10\\Desktop\\Project\\src\\main\\resources\\jdbc.properties");
            properties.load(reader);
            Class.forName(properties.getProperty("db.driver.name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(properties.getProperty("db.conn.url"),properties.getProperty("db.username"), properties.getProperty("db.password"));
    }

    public static void testConnection(){
        try {
            Connection connection = getConnection();
            System.out.println(connection.getTransactionIsolation());
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

}