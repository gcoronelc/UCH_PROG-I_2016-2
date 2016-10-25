package pe.egcc.pagotrabajador.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Model {

  // Datos
  private String tipo;
  private String cargo;
  private int horas;
  // Resultado
  private double sueldo;
  private double bono;

  public Model() {
  }

  public Model(String tipo, String cargo, int horas) {
    this.tipo = tipo;
    this.cargo = cargo;
    this.horas = horas;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  public double getBono() {
    return bono;
  }

  public void setBono(double bono) {
    this.bono = bono;
  }

}
