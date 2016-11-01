package pe.egcc.pract02.prueba;

import pe.egcc.pract02.model.CategoriaModel;
import pe.egcc.pract02.service.CursoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    CursoService service = new CursoService();
    for(CategoriaModel m: service.getCategorias()){
      System.out.println(m.toString());
    }
  }
}
