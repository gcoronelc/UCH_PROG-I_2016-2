package pe.uch.app.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Turismo {

  // Datos
  private String ciudad;
  private String paquete;
  private int personas;
  // Resultado
  private double precio;
  private double importe;
  private double impuesto;
  private double total;

  public Turismo() {
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getPaquete() {
    return paquete;
  }

  public void setPaquete(String paquetes) {
    this.paquete = paquetes;
  }

  public int getPersonas() {
    return personas;
  }

  public void setPersonas(int personas) {
    this.personas = personas;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public double getImpuesto() {
    return impuesto;
  }

  public void setImpuesto(double impuesto) {
    this.impuesto = impuesto;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

}
