package pe.egcc.notasuch.controller;

import java.util.List;
import pe.egcc.notasuch.model.Nota;
import pe.egcc.notasuch.service.NotaService;

public class NotaController {

  public List<Nota> obtenerLista(String nombre) {
    NotaService service = new NotaService();
    return service.getLista(nombre);
  }

  public void add(Nota bean) {
    NotaService service = new NotaService();
    service.add(bean);
  }

}
