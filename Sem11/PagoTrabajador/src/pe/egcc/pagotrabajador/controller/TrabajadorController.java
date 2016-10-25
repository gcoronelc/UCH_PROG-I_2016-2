package pe.egcc.pagotrabajador.controller;

import pe.egcc.pagotrabajador.model.Model;
import pe.egcc.pagotrabajador.service.Trabajador;
import pe.egcc.pagotrabajador.service.TrabajadorService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class TrabajadorController {

  public String[] getTipos() {
    String[] tipos = {Trabajador.TRAB_DOCENTE, Trabajador.TRAB_EMPLEADO};
    return tipos;
  }

  public String[] getCargos() {
    String[] cargos = {
      Trabajador.CARGO_COORDINADOR,
      Trabajador.CARGO_ASISTENTE,
      Trabajador.CARGO_SECRETARIA};
    return cargos;
  }

  public void procesar(Model model) {
    TrabajadorService service = new TrabajadorService();
    service.procesar(model);
  }
  
}
