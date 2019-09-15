/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Luis Granada
 */
public class ConnectionDb {
    private static final String USER_DB = "CAMPEONATO";
    private static final String PASSWORD_DB = "ORACLE";
    private static final String URL_DB = "jdbc:oracle:thin:@//localhost:1521/XE";
    private static ConnectionDb instance;
    private Connection connection;
    private ConnectionDb (){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(URL_DB,USER_DB,PASSWORD_DB);
            System.out.println("Conexion exitosa");
        } catch (Exception ex) {
            Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ConnectionDb getInstance(){
        if(instance == null ){
            instance = new ConnectionDb();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}
