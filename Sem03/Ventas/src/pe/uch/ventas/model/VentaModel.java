package pe.uch.ventas.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VentaModel {
  
  private int idVenta;
  private String producto;
  private double precio;
  private int cant;
  private double importe;

  public VentaModel() {
  }

  public VentaModel(int idVenta, String producto, double precio, int cant, double importe) {
    this.idVenta = idVenta;
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
    this.importe = importe;
  }

  public int getIdVenta() {
    return idVenta;
  }

  public void setIdVenta(int idVenta) {
    this.idVenta = idVenta;
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

  @Override
  public String toString() {
    return  idVenta + " | " + producto + " | " + precio + " | " + cant + " | " + importe;
  }
  
  
  
}
