package pe.egcc.notasuch.prueba;

import pe.egcc.notasuch.model.Nota;
import pe.egcc.notasuch.service.NotaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    try {
      // Datos
      Nota bean = new Nota();
      bean.setNombre("Manuel");
      bean.setNota1(16);
      bean.setNota2(18);
      bean.setProm(17);
      
      // Proceso
      NotaService service = new NotaService();
      service.add(bean);
      
      // Reporte
      System.out.println("ID: " + bean.getIdalu());
      
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
