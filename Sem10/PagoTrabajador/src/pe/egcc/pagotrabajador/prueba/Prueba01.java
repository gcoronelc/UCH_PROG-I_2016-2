package pe.egcc.pagotrabajador.prueba;

import pe.egcc.pagotrabajador.service.Bono;
import pe.egcc.pagotrabajador.service.Docente;
import pe.egcc.pagotrabajador.service.Empleado;
import pe.egcc.pagotrabajador.service.Trabajador;

public class Prueba01 {

  public static void main(String[] args) {
    Trabajador t = new Empleado(Trabajador.CARGO_SECRETARIA);
    Bono bono = new Bono();
    
    System.out.println("Sueldo: " + t.calSueldo());
    System.out.println("Bono: " + bono.calcBono(t));
  }
  
}
