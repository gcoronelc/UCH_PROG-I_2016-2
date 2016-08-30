package pe.egcc.app.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VentaModel {
  
  private String producto;
  private double precio;
  private int cant;
  private double importe;

  public VentaModel() {
  }

  public VentaModel(String producto, double precio, int cant, double importe) {
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
    this.importe = importe;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }
  
  
}
