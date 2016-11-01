package pe.egcc.pract02.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class CategoriaModel {
  
  private String categoria;
  private double costo;
  private double pagoHora;

  public CategoriaModel() {
  }

  public CategoriaModel(String categoria, double costo, double pagoHora) {
    this.categoria = categoria;
    this.costo = costo;
    this.pagoHora = pagoHora;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public double getCosto() {
    return costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

  public double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  @Override
  public String toString() {
    return categoria + " - " + costo + " - " + pagoHora;
  }
  
  
  
}
