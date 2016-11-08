package pe.egcc.notasuch.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

  public static Connection getConnection() throws SQLException{
    // Parámetros
    String driver = "com.mysql.jdbc.Driver";
    String urlDB = "jdbc:mysql://localhost:3306/uch";
    String user = "uch";
    String pass = "admin";
    // Objeto connection
    Connection cn = null;
    try {
      // Paso 1: Cargar el driver
      Class.forName(driver).newInstance();
      // Paso 2: Obtener Connection
      cn = DriverManager.getConnection(urlDB, user, pass);
    } catch (Exception e) {
      e.printStackTrace();
      throw new SQLException("No se tiene acceso al servidor.");
    }
    return cn;
  }

  
}
