package pe.egcc.notasuch.prueba;

import java.sql.Connection;
import pe.egcc.notasuch.db.AccesoDB;

public class Prueba01 {

  public static void main(String[] args) {
    try {
      Connection cn = AccesoDB.getConnection();
      System.out.println("Conexión ok.");
      cn.close();
      System.out.println("Chau.");
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
