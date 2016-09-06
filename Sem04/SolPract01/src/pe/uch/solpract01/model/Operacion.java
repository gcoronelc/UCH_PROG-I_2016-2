package pe.uch.solpract01.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Operacion {
  
  private String tarjeta; // N: Normal P: Premium
  private String tipo; // C: consumo R: Retiro
  private String Origen; // C: Cajero V: Ventanilla  O: Otro
  private double importe;

  public Operacion() {
  }

  public Operacion(String tarjeta, String tipo, String Origen, double importe) {
    this.tarjeta = tarjeta;
    this.tipo = tipo;
    this.Origen = Origen;
    this.importe = importe;
  }
  
  

  public String getTarjeta() {
    return tarjeta;
  }

  public void setTarjeta(String tarjeta) {
    this.tarjeta = tarjeta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getOrigen() {
    return Origen;
  }

  public void setOrigen(String Origen) {
    this.Origen = Origen;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }
  
  
}
