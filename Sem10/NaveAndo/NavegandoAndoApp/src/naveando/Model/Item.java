package naveando.Model;

public class Item {

  // Datos
  private int tramo;
  private int intervalo;
  private int costo;
  // Consumo
  private double consumo;
  private double subtotal;

  public Item() {
  }

  public Item(int tramo, int intervalo, int costo) {
    this.tramo = tramo;
    this.intervalo = intervalo;
    this.costo = costo;
  }

  public int getTramo() {
    return tramo;
  }

  public void setTramo(int tramo) {
    this.tramo = tramo;
  }

  public int getIntervalo() {
    return intervalo;
  }

  public void setIntervalo(int intervalo) {
    this.intervalo = intervalo;
  }

  public int getCosto() {
    return costo;
  }

  public void setCosto(int costo) {
    this.costo = costo;
  }

  public double getConsumo() {
    return consumo;
  }

  public void setConsumo(double consumo) {
    this.consumo = consumo;
  }

  public double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
  }

  @Override
  public String toString() {
    return tramo + " | " + consumo + " | " + costo + " | " + subtotal;
  }

  
}
