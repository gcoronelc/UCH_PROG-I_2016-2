package pe.egcc.pagotrabajador.service;

public class Empleado extends Trabajador{

  private String cargo;

  public Empleado() {
  }

  public Empleado(String cargo) {
    this.cargo = cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
  
  @Override
  public double calSueldo() {
    double sueldo = 0.0;
    switch(cargo){
      case CARGO_COORDINADOR:
        sueldo = CARGO_COORDINADOR_SUELDO;
        break;
      case CARGO_ASISTENTE:
        sueldo = CARGO_ASISTENTE_SUELDO;
        break;
      case CARGO_SECRETARIA:
        sueldo = CARGO_SECRETARIA_SUELDO;
        break;
    }
    return sueldo;
  }
  
}
