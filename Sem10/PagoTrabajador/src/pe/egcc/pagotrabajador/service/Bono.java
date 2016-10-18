package pe.egcc.pagotrabajador.service;

public class Bono {
  
  public double calcBono(Trabajador t){
    double bono = 0.0;
    if(t instanceof Empleado){
      bono = t.calSueldo() * 1.0;
    } else if(t instanceof Docente){
      bono = t.calSueldo() * 0.70;
    }
    return bono;
  }
}
