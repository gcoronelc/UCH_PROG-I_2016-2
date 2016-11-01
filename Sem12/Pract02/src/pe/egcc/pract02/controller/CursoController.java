package pe.egcc.pract02.controller;

import pe.egcc.pract02.model.CategoriaModel;
import pe.egcc.pract02.model.CursoModel;
import pe.egcc.pract02.service.CursoService;
import sun.print.resources.serviceui;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class CursoController {
  
  private CursoService cursoService;

  public CursoController() {
    cursoService = new CursoService();
  }
  
  public CategoriaModel[] getCategorias(){
    return cursoService.getCategorias();
  }
  
  public void procesar(CursoModel model){
    cursoService.procesar(model);
  }
  
}
