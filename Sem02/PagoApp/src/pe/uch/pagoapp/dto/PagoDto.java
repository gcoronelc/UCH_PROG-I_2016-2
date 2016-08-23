package pe.uch.pagoapp.dto;

public class PagoDto {

  // Datos
  private int diasTrab;
  private int horasDia;
  private double pagoHora;
  // Reporte
  private double ingresos;
  private double renta;
  private double neto;

  /**
   * Constructor por defecto
   */
  public PagoDto() {
  }

  public int getDiasTrab() {
    return diasTrab;
  }

  public void setDiasTrab(int diasTrab) {
    this.diasTrab = diasTrab;
  }

  public int getHorasDia() {
    return horasDia;
  }

  public void setHorasDia(int horasDia) {
    this.horasDia = horasDia;
  }

  public double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  public double getRenta() {
    return renta;
  }

  public void setRenta(double renta) {
    this.renta = renta;
  }

  public double getNeto() {
    return neto;
  }

  public void setNeto(double neto) {
    this.neto = neto;
  }
  
}
