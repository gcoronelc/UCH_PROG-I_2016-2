package pe.egcc.pagotrabajador.service;

public class Docente extends Trabajador{

  private int horas;

  public Docente() {
  }

  public Docente(int horas) {
    this.horas = horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }
  
  
  @Override
  public double calSueldo() {
    double sueldo;
    sueldo = horas * DOCENTE_PAGO_HORA;
    return sueldo;
  }

  
}
