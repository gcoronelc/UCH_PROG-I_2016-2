package pe.egcc.notasuch.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.notasuch.db.AccesoDB;
import pe.egcc.notasuch.model.Nota;

public class NotaService {


  public List<Nota> getLista(String nombre){
    List<Nota> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idalu, nombre, nota1, nota2, prom "
              + "from notas where nombre like concat('%',?,'%')";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, nombre);
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        Nota bean = new Nota();
        bean.setIdalu(rs.getInt("idalu"));
        bean.setNombre(rs.getString("nombre"));
        bean.setNota1(Integer.parseInt(rs.getString("nota1")));
        bean.setNota2(Integer.parseInt(rs.getString("nota2")));
        bean.setProm(Integer.parseInt(rs.getString("prom")));
        lista.add(bean);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException("Error en el proceso.");
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }
  
}
