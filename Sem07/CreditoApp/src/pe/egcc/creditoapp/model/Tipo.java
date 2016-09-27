package pe.egcc.creditoapp.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Tipo {
  
  private String codigo;
  private String descripcion;
  private double interes;
  private int minMeses;
  private int maxMeses;

  public Tipo() {
  }

  public Tipo(String codigo, String descripcion, double interes, int minMeses, int maxMeses) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.interes = interes;
    this.minMeses = minMeses;
    this.maxMeses = maxMeses;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getInteres() {
    return interes;
  }

  public void setInteres(double interes) {
    this.interes = interes;
  }

  public int getMinMeses() {
    return minMeses;
  }

  public void setMinMeses(int minMeses) {
    this.minMeses = minMeses;
  }

  public int getMaxMeses() {
    return maxMeses;
  }

  public void setMaxMeses(int maxMeses) {
    this.maxMeses = maxMeses;
  }

  @Override
  public String toString() {
    String texto = codigo + " - " + descripcion;
    return texto;  
  }
  
  
}
