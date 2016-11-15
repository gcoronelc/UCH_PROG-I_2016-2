package pe.egcc.notasuch.prueba;

import java.util.List;
import pe.egcc.notasuch.model.Nota;
import pe.egcc.notasuch.service.NotaService;

public class Prueba02 {

  public static void main(String[] args) {
    try {
      // Dato
      String nombre = "A";
      // Proceso
      NotaService service = new NotaService();
      List<Nota> lista = service.getLista(nombre);
      // Reporte
      for(Nota bean : lista){
        System.out.println(bean.getNombre() + "lista" + bean.getProm());
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }


  
}
