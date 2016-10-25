package pe.egcc.pagotrabajador.service;

import pe.egcc.pagotrabajador.model.Model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class TrabajadorService {
  
  public void procesar(Model model){
    // Proceso
    Trabajador trabajador = null;
    switch(model.getTipo()){
      case Trabajador.TRAB_DOCENTE:
        trabajador = new Docente(model.getHoras());
        break;
      case Trabajador.TRAB_EMPLEADO:
        trabajador = new Empleado(model.getCargo());
        break;
    }
    model.setSueldo(trabajador.calSueldo());
    Bono bono = new Bono();
    model.setBono(bono.calcBono(trabajador));
  }
  
}
