package pe.adcb.catalogo.prueba;

import java.sql.Connection;
import pe.adcb.catalogo.db.AccesoDB;

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
