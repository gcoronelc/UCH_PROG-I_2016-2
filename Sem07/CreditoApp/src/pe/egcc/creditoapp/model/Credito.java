package pe.egcc.creditoapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Credito {

  private String codigo;
  private String descripcion;
  private double capital;
  private double interes;
  private int meses;
  private List<Item> cuotas;

  public Credito() {
    cuotas = new ArrayList<>();
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

  public double getCapital() {
    return capital;
  }

  public void setCapital(double capital) {
    this.capital = capital;
  }

  public double getInteres() {
    return interes;
  }

  public void setInteres(double interes) {
    this.interes = interes;
  }

  public int getMeses() {
    return meses;
  }

  public void setMeses(int meses) {
    this.meses = meses;
  }

  public List<Item> getCuotas() {
    return cuotas;
  }

  public void setCuotas(List<Item> cuotas) {
    this.cuotas = cuotas;
  }

  
  
}
